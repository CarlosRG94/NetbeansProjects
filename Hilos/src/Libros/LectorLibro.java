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
public class LectorLibro implements Runnable {

    private final Libro libro;

    public LectorLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public void run() {
        synchronized (libro) {
            System.out.println(Thread.currentThread().getName() + " esperando a que sea escrito el libro:" + this.libro.getTitulo());
            try {
                libro.wait();
            } catch (InterruptedException ex) {
               Logger.getLogger(LectorLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName() + "El libro ha sido escrito. Lo lee");
        }
    }

}
