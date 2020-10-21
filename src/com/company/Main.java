package com.company;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main{
    public static int times = 0;

    public static void main(String[] args) throws InterruptedException {
        ClasePrincipal nueva = new ClasePrincipal();

    }

    public static void setTimes(int times) {
        Main.times = times;
    }

    public static int getTimes() {
        return times;
    }
}
