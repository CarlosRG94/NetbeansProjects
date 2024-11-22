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
public class ProductorConsumidor {
     public static void main(String[] args) {
     Buffer almacen = new Buffer();
     Productor productor = new Productor(almacen); 
     Consumidor consumidor = new Consumidor(almacen);
     consumidor.start();
     productor.start();
     
     }
}
