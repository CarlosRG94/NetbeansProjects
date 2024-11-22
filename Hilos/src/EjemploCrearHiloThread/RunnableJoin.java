/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCrearHiloThread;

/**
 *
 * @author carli
 */
public class RunnableJoin {
        public static void main(String[] args) throws InterruptedException{
        Thread hilo = new Thread( new EjemploHiloRunnable("hilo1",2000));
        Thread hilo2 = new Thread( new EjemploHiloRunnable("hilo2",1000));
        Thread hilo3 = new Thread( new EjemploHiloRunnable("hilo3",500));
        hilo.start();
        hilo.join();
        hilo2.start();
        hilo2.join();
        hilo3.start();
        hilo3.join();
        
    }
}
