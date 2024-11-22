/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduceConsume;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carli
 */
public class Consumir extends Thread {

    private final Almacen almacen;
    private int valor;

    public Consumir(Almacen almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            valor = almacen.coger();
            System.out.println("El consumidor a cogido:" + valor);
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
