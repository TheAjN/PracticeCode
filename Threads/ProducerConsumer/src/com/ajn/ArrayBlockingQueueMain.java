package com.ajn;

import java.util.Random;
import java.util.concurrent.*;

import static com.ajn.Main.EOF;

//EXAMPLE OF -
//ArrayBlockingQueue
//ExecutorService
public class ArrayBlockingQueueMain {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);
        // ReentrantLock bufferLock = new ReentrantLock(); Reentrant lock is not required

        //to manage fixed number of threads in a thread pool(in this case its 3)
        //This avoids us to explicitly create and execute threads
        //If number of Runnable classes executed is more than that of the size of the thread pool,
        //then the additional threads will be on queue until one of the threads terminate within the thread pool

        //To create an instance of ExecutorService, one must use a factory method (static method) of the Executors class
        //which returns an instance of ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        myProducer2 producer = new myProducer2(buffer, ThreadColour.ANSI_GREEN); //buffer is referenced to all 3 objects here
        myConsumer2 consumer1 = new myConsumer2(buffer, ThreadColour.ANSI_RED);
        myConsumer2 consumer2 = new myConsumer2(buffer, ThreadColour.ANSI_CYAN);

        //Either the code will run fine OR there will be an IndexOutOfBoundsException
       /* new Thread(producer).start();
       new Thread(consumer1).start();
        new Thread(consumer2).start();*/

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);


        //If we need threads to return object or a value, we need to use object of type future
        Future<String> future = executorService.submit(() -> ThreadColour.ANSI_WHITE + "I am called from Callable class");


        try {

            //The result can only be retrieved using method get when the computation has completed,
            //blocking if necessary until the future object is ready
            // ie, when we're calling it from the main thread,
            //our application will be frozen until the results are available.
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

        //To shut down the ExecutorService
        //This is an ordered shutdown, that means the pending threads will execute even after the service is closed
        executorService.shutdown();

    }
}

//In the below 2 classes, we are using the object of type ArrayBlockingQueue called "buffer" which is thread safe
// Hence no Re-entrant lock object is required

class myProducer2 implements Runnable {

    private final ArrayBlockingQueue<String> buffer;
    private final String color;

    public myProducer2(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] values = {"1", "2", "3", "4", "5", "6"};

        for (String st : values) {

            try {
                System.out.println(color + "Adding....." + st);
                buffer.put(st);
                Thread.sleep(random.nextInt(1000));
            } catch (Exception e) {
                System.out.println("Producer got interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting.....");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class myConsumer2 implements Runnable {

    private final ArrayBlockingQueue<String> buffer;
    private final String color;

    public myConsumer2(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) { //Checks the next element without actually removing it from the queue
                        //NOTE - .peek() doesn't block upcoming threads, which might cause thread inteference, Hence the null pointer exception
                        //due to other consumer thread using .take() method to remove the value
                        //due to this reason this block of code is synchronized
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take()); //Here, .take() always blocks upcoming threads
                        // before removing the object from buffer, since the class of object is "thread safe" (ArrayBlockingQueue)
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
