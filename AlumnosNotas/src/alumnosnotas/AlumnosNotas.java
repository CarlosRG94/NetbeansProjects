/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosnotas;

import java.util.ArrayList;


/** *
 * @author carli
 */
public class AlumnosNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrupoClase grupo = new GrupoClase();
        ArrayList<Alumno> alumnos = grupo.alumnos();
        grupo.mostrarMedias(alumnos);

    }
}



        
        
