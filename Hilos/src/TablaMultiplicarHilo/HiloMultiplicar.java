/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaMultiplicarHilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carli
 */
public class HiloMultiplicar extends Thread {

    private String nombre;
    private int numero;
    private int dormir;

    public HiloMultiplicar(String nombre, int numero, int dormir) {
        this.nombre = nombre;
        this.numero = numero;
        this.dormir = dormir;
    }

    @Override
    public void run() {
        int numeromultiplicado = 0;
        for (int i = 0; i <= 10; i++) {
            numeromultiplicado = i * numero;
            System.out.println("El numero multiplicado del " + nombre + " es " + numero + " y lo duerme " + dormir + " milisegundo, y el resultado es " + numeromultiplicado);
            try {
                sleep(dormir);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloMultiplicar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
