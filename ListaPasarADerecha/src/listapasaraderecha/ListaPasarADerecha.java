/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapasaraderecha;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ListaPasarADerecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros de la lista");
        int num = teclado.nextInt();
        int[] lista = rellenarArray(num);
           int[] orderArray = orderDerecha(lista);
            showArray(lista);
            System.out.println("");
            showArray(orderArray);
        
        
    }

    public static int[] rellenarArray(int cantidadnum) {
        Scanner teclado = new Scanner(System.in);
        int[] lista = new int[cantidadnum];
        for (int i = 0; i < cantidadnum; i++) {
            System.out.println("Introduzca un numero");
            lista[i] = teclado.nextInt();
        }
        return lista;
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("-");
            }
        }
    }

    public static int[] orderDerecha(int[] array) {
        int num = array.length;
        int [] neoarray = new int[num];
        int aux;
        int ultimonum = array[num - 1];
        for (int i = 0; num - 1 > i; num--) {
            aux =array[num - 2];
            neoarray[num - 1] = aux;
        }
        neoarray[0] = ultimonum;
        return neoarray;
    }
}

