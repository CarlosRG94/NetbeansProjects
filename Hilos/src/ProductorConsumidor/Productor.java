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
public class Productor extends Thread {

    private final Buffer almacen;

    public Productor(Buffer almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {
        synchronized (almacen) {
            try {
            for (int i = 0; i < 10; i++) {
                almacen.put(i);
                System.out.println("Productor pone:" + i);
                
                   
            }
             almacen.notify();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            

        }
    }

}
