/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosnotas;

import static alumnosnotas.Alumno.notaMediaTotal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class GrupoClase {

    ArrayList<Alumno> grupo;

    public GrupoClase() {
        this.grupo = new ArrayList();

    }

    public ArrayList<Alumno> alumnos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de notas que quiere inlcuir a la lista en cada trimestre");
        int notastrim = teclado.nextInt();
        System.out.println("Introduzca el número de alumnos");
        int numalumno = teclado.nextInt();

        int n = 0;
        while (n < numalumno) {
            int[] notasprimtrim = new int[notastrim];
            int[] notassegtrim = new int[notastrim];
            int[] notastertrim = new int[notastrim];
            for (int i = 0; i < notastrim; i++) {
                System.out.println("Por favor introduzca una nota: ");
                notasprimtrim[i] = teclado.nextInt();
            }
            for (int i = 0; i < notastrim; i++) {
                System.out.println("Por favor introduzca una nota: ");
                notassegtrim[i] = teclado.nextInt();
            }
            for (int i = 0; i < notastrim; i++) {
                System.out.println("Por favor introduzca una nota: ");
                notastertrim[i] = teclado.nextInt();
            }

            Alumno alumn = new Alumno(notasprimtrim, notassegtrim, notastertrim);
            grupo.add(alumn);
            n++;
        }

        return grupo;
    }

    public void mostrarMedias(ArrayList<Alumno> alumnos) {
        int i = 1;
        for (Alumno alum : alumnos) {
            double media;
            media = notaMediaTotal(alum.getNotasprimtrim(), alum.getNotassegtrim(), alum.getNotastertrim());
            System.out.println("Esta es la nota media del alumno " + i + " es: " + media);
            i++;

        }

    }
}
    
    
    

