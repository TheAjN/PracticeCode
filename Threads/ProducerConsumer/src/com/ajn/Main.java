package com.ajn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.ajn.Main.EOF;

//EXAMPLE OF -
// THREAD INTERFERENCE
// REENTRANT LOCK/UNLOCK, AND LOCKS USING TRY/FINALLY
// THREAD POOLS & EXECUTOR SERVICE
// FUTURE & CALLABLE
public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();        //ArrayList is not Thread-safe
        ReentrantLock bufferLock = new ReentrantLock();

        //to manage fixed number of threads in a thread pool(in this case its 3)
        //This avoids us to explicitly create and execute threads
        //If number of Runnable classes executed is more than that of the size of the thread pool,
        //then the additional threads will be on queue untill one of the threads terminate within the thread pool

        //To create an instance of ExecutorService, one must use a factory method (static method) of the Executors class
        //which returns an instance of ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        myProducer producer = new myProducer(buffer, ThreadColour.ANSI_GREEN, bufferLock);
        myConsumer consumer1 = new myConsumer(buffer, ThreadColour.ANSI_RED, bufferLock);
        myConsumer consumer2 = new myConsumer(buffer, ThreadColour.ANSI_CYAN, bufferLock);

        //Either the code will run fine OR there will be an IndexOutOfBoundsException
       /* new Thread(producer).start();
       new Thread(consumer1).start();
        new Thread(consumer2).start();*/

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);


        //If we need threads to return object or a value, we need to use object of type future
        Future<String> future = executorService.submit(()-> ThreadColour.ANSI_WHITE + "I am called from Callable class");

        //without using lambda
      /*  Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return ThreadColour.ANSI_WHITE + "I am called from Callable class";
            }
        });*/

        try {

            //The result can only be retrieved using method get when the computation has completed,
            //blocking if necessary until the future object is ready
            // ie, when we're calling it from the main thread,
            //our application will be frozen until the results are available.
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Somethinge went wrong");
            e.printStackTrace();
        }

        //To shut down the ExecutorService
        //This is an ordered shutdown, that means the pending threads will execute even after the service is closed
        executorService.shutdown();

    }
}

//In the below 2 classes, we aren't synchronizing the class object but rather arraylist object "buffer"

class myProducer implements Runnable {

    private final List<String> buffer;
    private final String color;
    ReentrantLock reentrantLock;

    public myProducer(List<String> buffer, String color, ReentrantLock reentrantLock) {
        this.buffer = buffer;
        this.color = color;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] values = {"1", "2", "3", "4", "5"};

        for (String st : values) {

            try {
                System.out.println(color + "Adding....." + st);
                reentrantLock.lock();       //Locks the code below it, where the other threads will be suspended
                try {
                    buffer.add(st);
                } finally {
                    reentrantLock.unlock(); //unlocks the lock and allows the suspended threads to proceed with executing this code
                }

                     Thread.sleep(random.nextInt(1000));
            } catch (Exception e) {
                System.out.println("Producer got interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting.....");
        reentrantLock.lock();
        buffer.add("EOF");
        reentrantLock.unlock();

    }
}

class myConsumer implements Runnable {

    private final List<String> buffer;
    private final String color;
    ReentrantLock reentrantLock;

    public myConsumer(List<String> buffer, String color, ReentrantLock reentrantLock) {
        this.buffer = buffer;
        this.color = color;
        this.reentrantLock = reentrantLock;
    }


    @Override
    public void run() {
        int count = 0;
        while (true) {
            //    reentrantLock.lock();
            try {
                if (reentrantLock.tryLock(3000, TimeUnit.NANOSECONDS)) { //tryLock() checks if the block of code is locked or not, if not,
                    //Then the thread will lock the below code automatically
                    try {
                        if (buffer.isEmpty()) {
                            //        reentrantLock.unlock(); // This has to be commented because a thread cannot unlock a lock
                            //which it doesn't own, therefore causing an illegalMonitorException
                            continue;
                        }
                        System.out.println(color + "counter = " + count);
                        count = 0;
                        if (buffer.get(0).equals(EOF)) {
                            System.out.println(color + "Exiting");
                            //   reentrantLock.unlock();
                            break;
                        } else {
                            System.out.println(color + "Removed " + buffer.remove(0));
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                } else {
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}