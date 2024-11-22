/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author carli
 */
public class MainLibro {
    public static void main(String[] args) {
    Libro libro = new Libro("Don quijote");
    
    LectorLibro lector1 = new LectorLibro(libro);
    Thread lector1Hilo = new Thread(lector1, "[lector 1]");
    lector1Hilo.start();
    
    EscritorLibro escritor = new EscritorLibro(libro);
    Thread escritorHilo = new Thread(escritor);
    escritorHilo.start();
    }
}
