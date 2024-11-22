/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca el número de términos que quieres mostrar por pantalla:");
        int num = teclado.nextInt();
        int[] array = serieFibo(num);
        showArray(array);
    }

    public static int[] serieFibo(int num) {
        int[] colFibo = new int[num];
        int valor1 = 0;
        int valor2 = 1;
        int sum = 0;
        int i = 0;
        while (i < colFibo.length) {
            sum = valor1 + valor2;
            colFibo[i] = valor1;
            valor1 = valor2;
            valor2 = sum;
            i++;
        }
        return colFibo;
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
    
