/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculopotencia;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class CalculoPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in); 
        System.out.println("Por favor introduzca el número");
        int num = teclado.nextInt();
        System.out.println("Ahora introduzca la potencia");
        int pot = teclado.nextInt();
        int calculo = calculoPot(num,pot);
        System.out.println("Este es el calculo de "+ num+ " elevado a "+ pot+ " : "+calculo );
        
    }
    public static int calculoPot(int num, int pot) {
        int calculo = 1;
        for (int i = 0; i < pot; i++) {
            calculo *= num;
        }
        return calculo;
    }
}


    
