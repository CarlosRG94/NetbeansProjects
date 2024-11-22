/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carli
 */
public class EscritorLibro  implements Runnable{
    private final Libro libro;

    public EscritorLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public void run() {
        synchronized (libro) {
            System.out.println( " El escritor comienza el libro:" + this.libro.getTitulo());
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LectorLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
            libro.setCompleted(true);
            System.out.println("El escritor ha finalizado el libro");
            libro.notify();
            System.out.println("Notificacion al lector");
        }
    }
}
