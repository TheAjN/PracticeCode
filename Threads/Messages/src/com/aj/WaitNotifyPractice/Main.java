package com.aj.WaitNotifyPractice;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();

        new Thread(new reloading(gun)).start();
        new Thread(new Fire(gun)).start();

    }
}


class Gun {

    private int bullets = 40;
    private boolean hasBullets = true;


    public int getBullets() {
        return bullets;
    }


    public synchronized void shoot() {


        while (!hasBullets) {
       /*     try {
                wait();
            } catch (InterruptedException e) {

            }*/
        }

        System.out.println("brrr");
        bullets--;
        if (bullets == 0) {
            hasBullets = false;
        }
        //    notify();
    }

    public synchronized void reload() {


        while (hasBullets) {
          /*  try {
                wait();
            } catch (InterruptedException e) {

            }*/
        }
        bullets += 40;
        hasBullets = true;
        System.out.println("Reloaded");
     //   notify();
    }

}


class Fire implements Runnable {

    Gun gun;

    public Fire(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void run() {
        while (gun.getBullets() != 0) {
            gun.shoot();
        }

    }
}


class reloading implements Runnable {

    Gun gun;

    public reloading(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            gun.reload();
        } catch (InterruptedException e) {

        }
    }
}
