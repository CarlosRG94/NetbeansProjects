/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letradni;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class LetraDni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letradni;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca el número del dni:");
        int numdni = teclado.nextInt();
        letradni = calculoLetra(numdni);
        System.out.println("El dni completo es " + numdni + letradni);
    }

    public static char calculoLetra(int numdni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra;
        int numindice;
        numindice = numdni % 23;
        letra = letras[numindice];
        return letra;
    }
}
