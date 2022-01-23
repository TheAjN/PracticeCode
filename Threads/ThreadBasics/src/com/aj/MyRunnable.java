package com.aj;

import static com.aj.ThreadColour.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello MyRunnable's implementation of run()");
    }
}
