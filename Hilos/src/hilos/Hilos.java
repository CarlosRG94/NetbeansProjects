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
public class Hilos extends Thread {
    private String nombre;
    private int delay;
    
    public Hilos( String n, int del){
    this.nombre = n;
    this.delay = del;
    }
    @Override
    public void run(){
        try {
            sleep(this.delay);
            System.out.println("Hola desde " + this.nombre+ " "+ this.delay + "ms");
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }
    }
}
