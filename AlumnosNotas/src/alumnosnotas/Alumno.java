/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosnotas;

import java.util.ArrayList;

/**
 *
 * @author carli
 */
public class Alumno {

    private int[] notasprimtrim;
    private int[] notassegtrim;
    private int[] notastertrim;

    public Alumno(int[] notasprimtrim, int[] notassegtrim, int[] notastertrim) {
        this.notasprimtrim = notasprimtrim;
        this.notassegtrim = notassegtrim;
        this.notastertrim = notastertrim;
    }

    public static double notaMediaTrimes(int[] notas) {
        double aux = 0;
        for (int i = 0; i < notas.length; i++) {
            aux += notas[i];
        }
        double notmed = aux / notas.length;
        return notmed;
    }

    public static double notaMediaTotal(int[] notaprim, int[] notaseg, int[] noteterc) {
        double mediatotal;
        mediatotal = (notaMediaTrimes(notaprim) + notaMediaTrimes(notaseg) + notaMediaTrimes(noteterc)) / 3;
        return mediatotal;
    }

    public int[] getNotasprimtrim() {
        return notasprimtrim;
    }

    public void setNotasprimtrim(int[] notasprimtrim) {
        this.notasprimtrim = notasprimtrim;
    }

    public int[] getNotassegtrim() {
        return notassegtrim;
    }

    public void setNotassegtrim(int[] notassegtrim) {
        this.notassegtrim = notassegtrim;
    }

    public int[] getNotastertrim() {
        return notastertrim;
    }

    public void setNotastertrim(int[] notastertrim) {
        this.notastertrim = notastertrim;
    }

}
