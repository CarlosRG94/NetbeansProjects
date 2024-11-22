/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaMultiplicarHilo;

/**
 *
 * @author carli
 */
public class Multiplicar {

    public static void main(String[] args) {
        HiloMultiplicar hilo = new HiloMultiplicar("hilo1", 4, 3000);
        hilo.start();

    }
}
