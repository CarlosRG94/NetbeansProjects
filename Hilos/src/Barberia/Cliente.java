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
public class Cliente extends Thread{
  private final Peluqueria pelu;

    public Cliente(Peluqueria pelu) {
        this.pelu = pelu;
    }

    @Override
    public void run() {
        // Intenta entrar a la peluquería
        pelu.entraCliente();
    }
   
}
