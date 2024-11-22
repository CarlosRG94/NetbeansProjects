/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarelemento;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class BuscarElemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] coleccion = rellenarArray();
        System.out.println("Introduzca el número a comparar");
        Scanner teclado = new Scanner(System.in);
        int elemento = teclado.nextInt();
        compararElementos(coleccion,elemento);
       
    }
    
     public static int[] rellenarArray(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca cuantos numeros quiere almacenar");
        int n = teclado.nextInt();
        int[] array = new int[n];
        for(int i = 0; i< array.length; i++){
            System.out.println("Introduzca un numero");
            array[i] = teclado.nextInt();
        }
        return array;
    }
     
    public static void compararElementos(int[] array, int elemento) {
        int i = 0;
        boolean esigual = false;
        while (i < array.length) {
            if (elemento == array[i]) {
                System.out.println("El elemento " + elemento + " esta en la posicion " + (i+1) + " del arreglo");
                esigual = true;
            }
            i++;
        }
        if (esigual == false) {
            System.out.println("No hay ningun número igual en la colección");
        }

    }
}
                    
    
