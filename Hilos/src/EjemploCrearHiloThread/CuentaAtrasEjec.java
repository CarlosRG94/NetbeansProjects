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
public class CuentaAtrasEjec {

    public static void main(String[] args) {
        HiloCuentaAtras hilo = new HiloCuentaAtras(10);
        HiloCuentaAtras hilo2 = new HiloCuentaAtras(11);
        hilo.run();
        hilo2.run();

        Thread hil = new Thread(new HiloCuentaAtras(10));
        Thread hil2 = new Thread(new HiloCuentaAtras(11));
        hil.start();
        hil2.start();

    }
}
