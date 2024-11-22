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
public class Peluqueria {
    private final int capacidadSillas = 4;
    private  int sillasOcupadas = 0;
    private boolean durmiendo = true;
    
    public synchronized void entraCliente(){
        System.out.println("Ha intentado entrar un cliente");
        if(sillasOcupadas >= capacidadSillas){
            System.out.println("No hay sillas disponibles.Cliente esperando fuera");
        }else{
        //Cliente ocupa una silla
        sillasOcupadas++;
        System.out.println("Cliente ocupa una silla. Sillas ocupadas:"+ sillasOcupadas);
        if(durmiendo){
        durmiendo = false;
        notify();
        }
        }
    }
    public synchronized void atenderCliente(){
        while (sillasOcupadas == 0) {
            try {
                // Si no hay clientes, el barbero duerme
                durmiendo = true;
                System.out.println("No hay clientes. El barbero está durmiendo.");
                wait(); // Barbero espera hasta que un cliente lo despierte
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Atiende a un cliente
        System.out.println("El barbero está atendiendo a un cliente nuevo.Sale el que ha terminado");
        sillasOcupadas--; // Libera una silla
        System.out.println("Sillas ocupadas: " + sillasOcupadas);
    }
    
    
}
