/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduceConsume;

/**
 *
 * @author carli
 */
public class Almacen {

    //Creamos dos variables una para almacenar el contenida y una booleana para esperar si esta vacio a que produzca y si esta lleno a que consuma
    private int contenido = 0;
    private boolean disponible = false;

    //Creamos un metodo sincronizado en el que hay un bucle que si disponible es falso espera y si es verdadero no entra en bucle y se pasa a falso disponible y notifica 
    public synchronized int coger() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        disponible = false;
        notify();
        return contenido;
    }

    //Creamos un bucle donde si es falso no entra en el y crea la variable y lo pone en true y notifica, si este es true es porque esta lleno y tiene a que esperar a que el otro consuma y lo ponga en false
    public synchronized void crear(int valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        contenido = valor;
        disponible = true;
        notify();
    }

}
