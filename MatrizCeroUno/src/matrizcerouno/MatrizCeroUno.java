/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizcerouno;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class MatrizCeroUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = rellenarMatriz();
        showMatriz(matriz);
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
                if (i == 0 || j == 0 || i == fil - 1 || j == col - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
     public static void showMatriz(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
