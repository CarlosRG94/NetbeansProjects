/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesconcesionario;

/**
 *
 * @author carli
 */
public class Coches {

    private int numCoche;

    public Coches() {
        this.numCoche = 4;
    }

    public synchronized void  sumaCoche() {
        numCoche++;
    }

    // Método sincronizado para restar un coche
    public synchronized boolean probarCoche() {
        if (numCoche > 0) {
            numCoche--; // Decrementa el número de coches
            return true;
        }
        return false; // No hay coches disponibles
    }

    public synchronized int getNumCoche() {
        return numCoche;
    }

    public synchronized void setNumCoche(int numCoche) {
        this.numCoche = numCoche;
    }
}
