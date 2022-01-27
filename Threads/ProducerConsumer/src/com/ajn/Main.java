package com.ajn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static com.ajn.Main.EOF;

//EXAMPLE OF THREAD INTERFERENCE, REENTRANT LOCK/UNLOCK, AND LOCKS USING TRY/FINALLY
public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();        //ArrayList is not Thread-safe
        ReentrantLock bufferLock = new ReentrantLock();
        myProducer producer = new myProducer(buffer, ThreadColour.ANSI_GREEN, bufferLock);
        myConsumer consumer1 = new myConsumer(buffer, ThreadColour.ANSI_RED, bufferLock);
        myConsumer consumer2 = new myConsumer(buffer, ThreadColour.ANSI_CYAN, bufferLock);

        //Either the code will run fine OR there will be an IndexOutOfBoundsException
        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}

//In the below 2 classes, we aren't synchronizing the class object but rather arraylist object "buffer"

class myProducer implements Runnable {

    private List<String> buffer;
    private String color;
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
            } catch (InterruptedException e) {
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

    private List<String> buffer;
    private String color;
    ReentrantLock reentrantLock;

    public myConsumer(List<String> buffer, String color, ReentrantLock reentrantLock) {
        this.buffer = buffer;
        this.color = color;
        this.reentrantLock = reentrantLock;
    }


    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                if (buffer.isEmpty()) {
            //        reentrantLock.unlock(); // This has to be commented because a thread cannot unlock a lock
                                            //which it doesn't own, therefore causing an illegalMonitorException
                    continue;
                }
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
        }
    }
}