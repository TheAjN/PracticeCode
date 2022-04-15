package com.aj;


//Example for Thread Variables concept
public class Main {
    public static void main(String[] args) {

        CountDown countDown = new CountDown();
      //  CountDown countDown2 = new CountDown();

        Thread t1 = new countThread(countDown); //To see Thread interference,
                                                // add same instance "countDown" to both of the threads
        t1.setName("Thread 1");
        Thread t2 = new countThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountDown {
    private int i;  //since we changed "i" from a local variable to an instance variable
                    //the Threads t1 and t2 use the same instance of Countdown class, which also means they use the same instance
                    //of "i" field, therefore the for loop only iterates 11 times (10 times plus the first time when both the
                    //threads run simultaneously (i =10))

     public void docountdown() { //mention "synchronized" in between public and void to prevent thread interference
        String color;

        switch (Thread.currentThread().getName()) {

            case "Thread 1":
                color = ThreadColour.ANSI_CYAN;
                break;

            case "Thread 2":
                color = ThreadColour.ANSI_PURPLE;
                break;

            default:
                color = ThreadColour.ANSI_GREEN;
        }

        synchronized (this){    //Since the threads share a single countdown object, it would make sense to add
                                //the countdown object itself within the countdown class (this) to prevent thread inteference
            for(i=10; i>0 ; i--){
                System.out.println(color + Thread.currentThread().getName() + " : i = "+i);
            }
        }


    }
}


class countThread extends Thread{
    private final CountDown countDown;


    countThread(CountDown countDown){
        this.countDown = countDown;
    }

    @Override
    public void run(){
        this.countDown.docountdown();

    }

}
