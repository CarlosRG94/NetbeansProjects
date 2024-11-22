/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filosofos;

/**
 *
 * @author carli
 */
import java.util.concurrent.Semaphore;

public class FilosofosSemaforos {
    public static void main(String[] args) {
        // Crear los tenedores como semáforos individuales
        Semaphore[] tenedores = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            tenedores[i] = new Semaphore(1);
        }

        // Crear un semáforo para limitar el número de filósofos que comen simultáneamente
        Semaphore limiteFilosofos = new Semaphore(2); // Permite solo 2 filósofos a la vez

        // Crear e iniciar los hilos para cada filósofo
        for (int i = 0; i < 5; i++) {
            int id = i;
            Semaphore tenedorIzq = tenedores[i];
            Semaphore tenedorDer = tenedores[(i + 1) % 5];

            new Thread(() -> {
                while (true) {
                    try {
                        // Pensar
                        System.out.println("Filósofo " + id + " está pensando.");
                        Thread.sleep(1000); // Simula el tiempo de pensar

                        // Intentar comer (limitar acceso al recurso crítico)
                        limiteFilosofos.acquire();

                        tenedorIzq.acquire(); // Tomar tenedor izquierdo
                        tenedorDer.acquire(); // Tomar tenedor derecho

                        // Comer
                        System.out.println("Filósofo " + id + " está comiendo.");
                        Thread.sleep(2000); // Simula el tiempo de comer

                        // Dejar los tenedores
                        tenedorIzq.release();
                        tenedorDer.release();

                        limiteFilosofos.release();

                        System.out.println("Filósofo " + id + " dejó los tenedores y vuelve a pensar.");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}


