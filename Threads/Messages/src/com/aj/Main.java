package com.aj;

import java.util.Random;


//To truly understand the flow of this code, it would be best to debug it
public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        //there is no order on which thread is going to run first, if wait() & notifyAll() aren't added in read() & write(),
        //then output definitely will be inconsistent.
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}

class Message {

    private String message;
    private boolean empty = true;

    //Why both the methods are synchronized?
    //When a thread is running one of these methods, we don't
    //actually want another thread to be able to run either methods, so we don't want
    //the reader thread to run while the writer thread is writing a message and vice
    //versa

    //Deadlock scenario
    public synchronized String read() { //read() gets stuck in the while loop forever, while the thread can't
        //access write() method since the class object is locked

        while (empty) {       //looping until there is a message to read
            try {
                // When wait() method is called,
                // the calling thread stops its execution
                // until notify() or notifyAll() method is invoked by some other Thread.
                wait();     //Temporarily the thread running this method gives up the lock of the class object
                            // (In this case, message object) & waits for the other thread to run this class object
            } catch (InterruptedException e) {

            }

        }
        empty = true;
        notifyAll();        //wakes up all the waiting threads(in this case,wait() in write()) that were in sleep
        return message;     //returning the message to the Consumer
    }

    public synchronized void write(String message) {     //Producer providing the message to write it in the class

        while (!empty) {      //Checking to see if the message is empty, if it isn't we are going to loop until
            try {             //the message is empty
                wait();
            } catch (InterruptedException e) {

            }

        }
        empty = false;
        this.message = message;
        notifyAll(); //wakes up all the waiting threads(in this case,wait() in read()) that were in sleep
    }

}

//NOTE - write() and read() methods are constantly going back and forth every message, the threads are running concurrently
//but these 2 methods are synchronized, ie the other thread can't access the object until one completes executing
class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] info = {"Humpty dumpty sat of a wall",
                "Humpty dumpty had a great fall",
                "All the kings horses and all the kings men",
                "Couldn't put humpty together again"};

        Random random = new Random();
        for (int i = 0; i < info.length; i++) {
            message.write(info[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Finished");

    }

}

class Reader implements Runnable {

    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished")
                ; latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}