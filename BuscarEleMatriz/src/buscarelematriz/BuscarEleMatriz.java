/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarelematriz;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class BuscarEleMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = rellenarMatriz();
        System.out.println("Introduzca el número a comparar");
        Scanner teclado = new Scanner(System.in);
        int elemento = teclado.nextInt();
        compararElementos(matriz, elemento);
    }

    public static int[][] rellenarMatriz() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca el número de filas de la matriz:");
        int fil = teclado.nextInt();
        System.out.println("Por favor introduzca el número de columnas:");
        int col = teclado.nextInt();
        int[][] matriz = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Introduzca un número:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        return matriz;
    }

    public static void compararElementos(int[][] matriz, int elemento) {
        boolean esigual = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (elemento == matriz[i][j]) {
                    System.out.println("El elemento " + elemento + " esta en la posicion " + (i + 1) + "-" + (j + 1) + " de la matriz");
                    esigual = true;
                }
            }
        }
        if (esigual == false) {
            System.out.println("No hay ningun número igual en la matriz");
        }

    }
}   
    
