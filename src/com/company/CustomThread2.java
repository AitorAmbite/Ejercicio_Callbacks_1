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
        long timeMilli = 0;
        Timestamp inicio = new Timestamp(new Date().getTime());

        int veces = 0;
        for(int i=0;i<Main.getTimes();i++){
            try {
                sleep(2000);
                veces++;
                //System.out.println("Ejecutado "+veces);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Timestamp finalT = new Timestamp(new Date().getTime());
        timeMilli = finalT.getTime() - inicio.getTime();

        callback.decirNumVeces("Se ha ejecutado "+veces +" veces Y ha tardado "+timeMilli );
    }
}
