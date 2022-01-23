package com.aj;

import static com.aj.ThreadColour.*;

public class Main {
    public static void main(String[] args) {

        //Main class
        System.out.println(ANSI_GREEN + "Run the main thread");


        //Named class
        Thread anotherThread = new AnotherThread();

        anotherThread.setName("== AnotherThread ==");

        //Try changing the method start() to run(),
        // you will see that anotherThread will use the existing main thread instead
        //which is not a good thing
        anotherThread.start();      //Enables the JVM to run the run() method from the Thread class "AnotherThread"
        //  anotherThread.run();

        //Anonymous Class
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from Anonymous Thread");
            }
        }.start();

        //Main class again
        System.out.println(ANSI_GREEN + "Hello again from main thread"); //GREEN


        //Runnable Interface
       // new Thread(new MyRunnable()).start(); //RED
        //OR
         Thread myRunnable = new Thread(new MyRunnable());  //RED
          myRunnable.start();


        //Runnable Interface (Anonymous)
        new Thread(new MyRunnable() {
            @Override
            public void run() {     //replacing the content within run() from Runnable() class through overriding
                //  super.run(); //To execute the predefined run() method in the MyRunnable() class
                System.out.println(ANSI_PURPLE + "Hello from Anonymous class from Runnable Interface");

                try {
                    Thread.sleep(2000);
                    //join() method blocks the current thread and joins the reference thread
                    //to the current thread once the reference thread is executed/terminated
                    anotherThread.join(2000);
                    System.out.println(ANSI_PURPLE + "anotherThread thread is terminated/timed out");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_PURPLE + "wasn't able to join with anotherThread, got interrupted");
                    return;
                }

            }
        }).start();


        //To interrupt the thread of the "anotherThread" instance
        // anotherThread.interrupt();

        //   anotherThread.start();  //Throws an exception - "java.lang.IllegalThreadStateException: Thread is already started"
        //That means we cannot start() an instance of a Thread more than once
    }
}
