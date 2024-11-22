/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author carli
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Persona persona = new Persona("Carlos", 9);
     cambiar(persona);
        System.out.println(persona);
    }
    public static void cambiar(Persona persona){
    persona = new Persona("Antonio",10);
}
}
