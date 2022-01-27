package com.aj.SynchronizedPractice;

import static com.aj.SynchronizedPractice.ThreadColour.*;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread t1 = new Thread(new brackets(printer, ANSI_BLUE + "I have a cat"));
        Thread t2 = new Thread(new brackets(printer, ANSI_GREEN + "you have a dog"));
        Thread t3 = new Thread(new brackets(printer, ANSI_RED + "We need you"));
        Thread t4 = new Thread(new brackets(printer, ANSI_CYAN + "Everyone is thinking about it"));

        t4.start();
        t3.start();
        t2.start();
        t1.start();
       /* try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {

        }*/


    }
}


class Printer {


    public void todoSplit(String sentence) {

        String[] arr = sentence.split(" ");

        for (String a : arr) {
            try {
                System.out.print("[");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(a    + "]" + " ");
        }

    }

}

/*class wordCap implements Runnable {

    Printer printer;

    public wordCap(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (String a : printer.todoSplit()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(a.toUpperCase());
        }
    }
}*/

class brackets implements Runnable {

    private Printer printer;
    private String sentence;

    public brackets(Printer printer, String sentence) {
        this.printer = printer;
        this.sentence = sentence;
    }

    @Override
    public void run() {
        synchronized (printer){
            this.printer.todoSplit(sentence);
        }

    }
}
