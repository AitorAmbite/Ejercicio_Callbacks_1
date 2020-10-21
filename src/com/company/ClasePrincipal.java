package com.company;

public class ClasePrincipal implements callback{

    public ClasePrincipal() throws InterruptedException {
        CustomThread1 thread = new CustomThread1(); // Hilo 1 declaracion
        CustomThread2 thread2 = new CustomThread2(this); // hilo 2 declaracion
        thread.start(); // hilo 1 inicio
        thread.join(); // espero a que termine el hilo 1
        thread2.start(); // hilo 2 inicio

    }
    public void decirNumVeces(String cadena){
        System.out.println(cadena);
    }
}
