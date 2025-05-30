/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochesconcesionario;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carli
 */
public class PruebaCoches extends Thread {

    private final Coches coches;
    private final String nombreCliente;
    Semaphore semaforo ;

    public PruebaCoches(Coches coches, String nombreCliente,Semaphore semaforo) {
        this.coches = coches;
        this.nombreCliente = nombreCliente;
        this.semaforo=semaforo;
    }

    @Override
    public void run() {
            try {
                semaforo.acquire(); 
                System.out.println("El cliente " + nombreCliente + " esta esperando para probar el coche");   
                 if(coches.probarCoche()){
                     int numCoche =  coches.getNumCoche()+1;
                System.out.println("El cliente " + nombreCliente + " ha cogido el coche numero"+numCoche );
                sleep(5000);
                System.out.println("El cliente " + nombreCliente + " ha terminado de probar el coche"+numCoche);
                coches.sumaCoche();
                 }else{
                     System.out.println("No hay coches disponibles para " + nombreCliente+ " continua esperando");
                 }
                semaforo.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(PruebaCoches.class.getName()).log(Level.SEVERE, null, ex);
            }

    }

}
