package com.aj;

import static com.aj.ThreadColour.ANSI_BLUE;

public class AnotherThread  extends Thread {

    @Override
    public void run(){
     //  super.run();
       System.out.println(ANSI_BLUE + "Hello from "+currentThread().getName());     //currentThread() gets the name of this thread class
       try{
           Thread.sleep(1500);  //sleep() is a static method, and also Thread.sleep() can be called any where
                                    // if it is present inside a try/catch() block
       }catch (InterruptedException exception){
           System.out.println(ANSI_BLUE+"Sleep from "+currentThread().getName() +" got interuppted");
           return;
       }

        System.out.println(ANSI_BLUE+"Sleep complete, calling after sleep");
    }
}
