/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCrearHiloThread;

import static java.lang.Thread.sleep;

/**
 *
 * @author carli
 */
public class EjemploHiloRunnable implements Runnable {
            private int dormir;
            private String nombre;
            public EjemploHiloRunnable(String nombre, int dormir){
                    this.dormir = dormir;
                    this.nombre= nombre;
            }

    @Override
    public void run() {
        System.out.println("Soy el hilo"+ nombre);
        try {
            
            sleep(dormir);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    }
    
}
