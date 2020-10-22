package com.company;

public class CustomThread1 extends Thread{
    @Override
    public void run() {
        try {
            sleep( 4000);
            Main.times = (int) (Math.random()*(20-4+1)+4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
