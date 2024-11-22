/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarmetodo;

/**
 *
 * @author carli
 */
public class Sumador {
      
    public static void main(String[] args) {
        //Obtenemos los parámetros pasados al crear el proceso
        int numero1 = Integer.valueOf(args[0]);
        int numero2 = Integer.valueOf(args[1]);
        
        int suma = sumar(numero1, numero2);
        System.out.println("El resultado del sumatorio es el siguiente:"+ suma);
    }
    public static int sumar (int numero1, int numero2){
        int suma = 0;
        for (int i = numero1; i <= numero2; i++) {
            suma += i;
        }
        return suma;
    }
}
