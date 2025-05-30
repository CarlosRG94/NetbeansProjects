/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesconcesionario;

import java.util.concurrent.Semaphore;

/**
 *
 * @author carli
 */
public class CochesConcesionario {

    public static void main(String[] args) {
        Coches coche = new Coches();
         Semaphore semaforo = new Semaphore(4);
        PruebaCoches cliente1 = new PruebaCoches(coche, "Paco",semaforo);
        PruebaCoches cliente2 = new PruebaCoches(coche, "Antonio",semaforo);
        PruebaCoches cliente3 = new PruebaCoches(coche, "Carlos",semaforo);
        PruebaCoches cliente4 = new PruebaCoches(coche, "Manuel",semaforo);
        PruebaCoches cliente5 = new PruebaCoches(coche, "Jorge",semaforo);
        PruebaCoches cliente6 = new PruebaCoches(coche, "Maria",semaforo);
        PruebaCoches cliente7 = new PruebaCoches(coche, "Ana",semaforo);
        PruebaCoches cliente8 = new PruebaCoches(coche, "Laura",semaforo);
        PruebaCoches cliente9 = new PruebaCoches(coche, "Alberto",semaforo);
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        cliente6.start();
        cliente7.start();
        cliente8.start();
        cliente9.start();

    }

}
