package com.ajn;


public class Main {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread1().start();
        new Thread2().start();

    }

    private static class Thread1 extends Thread{

       public void run(){

           synchronized (lock1){
               System.out.println("Thread1: Holding lock1");
               try {
                   Thread.sleep(100);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
               System.out.println("Thread1: Waiting for lock2");
               synchronized (lock2){
                   System.out.println("Thread1: Has lock1 and lock2");
                   try {
                       Thread.sleep(100);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
               }
               System.out.println("Thread1: Released lock2");
           }
           System.out.println("Thread1: Released lock1. Exiting....");
       }
    }


    private static class Thread2 extends Thread{

        public void run(){

            synchronized (lock1){           //change "lock2" to achieve deadlock and "lock1" to resolve deadlock
                System.out.println("Thread2: Holding lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread2: Waiting for lock2");
                synchronized (lock2){       //change "lock1" to achieve deadlock and "lock2" to resolve deadlock
                    System.out.println("Thread2: Has lock2 and lock1");
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread2: Released lock2");
            }
            System.out.println("Thread2: Released lock1. Exiting....");
        }

    }




}
