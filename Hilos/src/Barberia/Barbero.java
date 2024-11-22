/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barberia;

/**
 *
 * @author carli
 */
public class Barbero extends Thread{
  private final Peluqueria pelu;

    public Barbero(Peluqueria pelu) {
        this.pelu = pelu;
    }

    @Override
    public void run() {
        while (true) {
            // Atiende a clientes en la peluquería
            pelu.atenderCliente();

            try {
                // Simula el tiempo que tarda en cortar el cabello
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
