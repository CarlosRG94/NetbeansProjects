/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author carli
 */
public class HilosEject {
      public static void main(String[] args) {
        Hilos hijo1 = new Hilos( "Hilo1",(int)(Math.random()*2000));
        Hilos hijo2 = new Hilos( "Hilo2",(int)(Math.random()*2000));
        Hilos hijo3 = new Hilos( "Hilo3",(int)(Math.random()*2000));
        hijo1.start();
        hijo2.start();
        hijo3.start();
    }
}
