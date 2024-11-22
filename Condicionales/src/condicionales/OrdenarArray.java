/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class OrdenarArray {

    /**
     * @return 
     */
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
    
    public static void showArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i < array.length-1){
            System.out.print("-");
            }
        }
         System.out.println("");
    }
    
    public static int[] orderingArray(int[] arrayorder){
        int aux;
        for(int i=0; i<arrayorder.length; i++){
            for (int j = 0; j <arrayorder.length-1; j++) {
                if(arrayorder[j]>arrayorder[j+1]){
                    aux= arrayorder[j+1];
                    arrayorder[j+1]= arrayorder[j];
                    arrayorder[j]= aux;
                }
            }
        }
        return arrayorder; 
    }
    
    public static void main(String[] args) {
        int[] array = rellenarArray();
         System.out.println("Lista desordenada");
        showArray(array);
        int[] arrayOrder = orderingArray(array);
         System.out.println("Lista ordenada");
        showArray(arrayOrder);
        
        
    }
    
}
