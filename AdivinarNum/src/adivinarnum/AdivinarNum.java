/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class AdivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numran = new Random();
        int num = numran.nextInt(9) + 1;
        acertarNumero(num);
    }

    public static void acertarNumero(int num) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        boolean acierto = true;
        while (i < 3 && acierto) {
            System.out.println("Introduzca un número del 1 al 9");
            int numelegido = teclado.nextInt();
            if (num == numelegido) {
                System.out.println("Has hacertado el número es " + num);
                acierto = false;
            } else if (num > numelegido) {
                System.out.println("El número que has insertado es menor");
            } else {
                System.out.println("El número que has insertado es mayor");
            }
            i++;
            System.out.println(" ");
        }
        if (acierto) {
            System.out.println("Se han terminados los intentos");
        }
    }
}

    
            
        
        
            
       
