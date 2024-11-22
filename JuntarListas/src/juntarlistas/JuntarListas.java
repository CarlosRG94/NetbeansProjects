/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juntarlistas;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class JuntarListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Introduzca la cantidad de números de la lista1:");
                int numlist1 = teclado.nextInt();
                int [] lista1 = crearListas(numlist1);
                 System.out.println("Introduzca la cantidad de números de la lista2:");
                 int numlist2 = teclado.nextInt();
                 int[] lista2 = crearListas(numlist2);
                 showArray(lista2);
                 showArray(lista1);
                int[] listafinal = sumarListas(lista1, lista2);
                 showArray(listafinal);
                int[] listafiorde = orderArray(listafinal);
                showArray(listafiorde);
    }
    public static int[] crearListas(int num){
        Scanner teclado = new Scanner(System.in);
        int[] lista = new int[num];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduzca un número:");
            lista[i] = teclado.nextInt();
        }
    return lista;
    }
    public static void showArray(int [] array){
       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
    public static int[] sumarListas(int[] lista1, int[]lista2){
        int num1 = lista1.length;
        int num2 = lista2.length;
        int sumanum = num1+num2;
        int[] listafinal = new int[sumanum];
        for (int i = 0; i < num1; i++) {
            listafinal[i] = lista1[i];
        }
        int aux = 0;
        while (num1< sumanum) {            
            listafinal[num1] = lista2[aux];
            num1++;
            aux++;
        }
        return listafinal;
    }
//    public static int[] orderArray( int[] listafinal){
//    int[] listafi = listafinal;
//    int aux;
//        for (int i = 0; i < listafi.length; i++) {
//            for (int j = 0; j < listafi.length-1; j++) {
//                if (listafi[j]> listafi[j+1]) {
//                    aux = listafi[j+1];
//                    listafi[j+1] = listafi[j];
//                    listafi[j] = aux;
//                }
//            }
//        }
//        return listafi;
//    }
    public static int[] orderArray( int[] listafinal){
    int[] listafi = listafinal;
    int menor;
    int aux;
        for (int i = 0; i < listafi.length; i++) {
            menor = i;
            for (int j = i; j < listafi.length-1; j++) {
                if (listafi[menor] > listafi[j+1]) {
                    menor = j+1;
                }
            }
            aux = listafi[i];
            listafi[i] = listafi[menor];
            listafi[menor] = aux;
        }
        return listafi;
    }
    
    
}
