package com.company;

import java.sql.Timestamp;
import java.util.Date;

public class CustomThread2 extends Thread{
    callback callback;
    public CustomThread2(callback callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        Date date = new Date();
        long timeMilli = date.getTime();
        Timestamp inicio = new Timestamp(timeMilli);
        int veces = 0;
        for(int i=0;i<Main.times;i++){
            try {
                sleep(2000);
                veces++;
                System.out.println("Ejecutado "+veces);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        timeMilli = date.getTime();
        Timestamp finalT = new Timestamp(timeMilli);
        callback.decirNumVeces("Se ha ejecutado "+veces +" veces Y ha tardado " +(finalT.getTime()-inicio.getTime()));
    }
}
