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
public class PeluqueriaMain {
    public static void main(String[] args) {
        Peluqueria pelu = new Peluqueria();

        // Crear y arrancar al barbero
        Barbero barbero = new Barbero(pelu);
        barbero.start();

        // Crear y arrancar clientes
        for (int i = 1; i <= 10; i++) {
            Cliente cliente = new Cliente(pelu);
            cliente.start();

            try {
                // Simula la llegada de clientes en intervalos aleatorios
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
