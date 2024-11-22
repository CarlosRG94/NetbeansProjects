/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorcopia;

import Agendas.Agenda;

/**
 *
 * @author carli
 */
public class ConstructorCopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda a1 = new Agenda( "Tarea","Deberes","Lectura","Práctica","Repaso");
        Agenda a2 = new Agenda(a1.getLunes(), a1.getMartes(), a1.getMiercoles(), a1.getJueves(), a1.getViernes());
        Agenda a3 = new Agenda(a2);
        
        for (int i = 1; i < 6; i++) {
            System.out.println("Esto tienes que hacer el dia "+ i + " de la semana");
            a1.mostrarTarea(i);
            System.out.println("Esto tienes que hacer el dia "+ i + " de la semana");
            a2.mostrarTarea(i);
            System.out.println("Esto tienes que hacer el dia "+ i + " de la semana");
            a3.mostrarTarea(i);
        }
    }
    
}
