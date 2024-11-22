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
public class MuchosHilos {
    public static void main(String[] args) {
        HiloSaluda hilo1 = new HiloSaluda("hilo1", 400);
        HiloSaluda hilo2 = new HiloSaluda("hilo2", 300);
        HiloSaluda hilo3 = new HiloSaluda("hilo3", 200);
        HiloSaluda hilo4 = new HiloSaluda("hilo4", 100);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
}
