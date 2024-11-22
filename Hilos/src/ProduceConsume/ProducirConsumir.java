/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduceConsume;

/**
 *
 * @author carli
 */
public class ProducirConsumir {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Producir productor = new Producir(almacen);
        Consumir consumidor = new Consumir(almacen);
        consumidor.start();
        productor.start();
    }
}
