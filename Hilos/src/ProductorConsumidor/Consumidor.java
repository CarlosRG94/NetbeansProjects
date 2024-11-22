/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

/**
 *
 * @author carli
 */
public class Consumidor extends Thread {

    private final Buffer almacen;
    private int valor;

    public Consumidor(Buffer almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {
        synchronized (almacen) {
            try {
                almacen.wait();
            for (int i = 0; i < 10; i++) {
                valor = almacen.get() -i;
                System.out.println("Consumidor coge:" + valor);
                
                    
            }
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            
        }
    }
}
