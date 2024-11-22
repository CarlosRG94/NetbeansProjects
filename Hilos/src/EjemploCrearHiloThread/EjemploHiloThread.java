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
public class EjemploHiloThread extends Thread{
    public static void main (String[] args){
        EjemploHiloThread a = new EjemploHiloThread();
        a.start();
     }
    @Override
    public void run(){
        System.out.println("Hola desde el hilo con thread");
    }
}
