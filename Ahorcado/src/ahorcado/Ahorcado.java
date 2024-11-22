/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a: El juego del ahorcado");
        char[] letras = retFrase();
        char[] carocultos = fraseOculta(letras);
        compLetras(letras, carocultos);

    }
    public static char[] retFrase(){
     Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = teclado.nextLine();
        String frasenospacio = frase.toLowerCase().replace(" ","");
        char[] letras = frasenospacio.toCharArray();
        return letras;
    }

    public static char[] fraseOculta(char[] letras) {
        char[] carocultos = new char[letras.length];
        int i = 0;
        while (i < letras.length) {
            carocultos[i] = '-';
                     i++;
        }
         System.out.println("Esta es la frase oculta: "+ Arrays.toString(carocultos));
        return carocultos;
    }

    public static void compLetras(char[] letras, char[] carocultos) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int vidas = 6;
        boolean fin = true;
        while (i < vidas && fin) {
            System.out.println("Introduce la letra que desee");
            char letra= teclado.next().toLowerCase().charAt(0);
            boolean intento = true;
            for (int j = 0; j < letras.length; j++) {
                if (letras[j] == letra && carocultos[j]!=letra) {
                    carocultos[j] = letra;
                    System.out.println("Ha hacertado la letra: " + letra + " " + Arrays.toString(carocultos));
                    intento = false;
                }else if (carocultos[j] == letra) {
                    System.out.println("La letra ya la introdujo anteriormente esto le resta una vida");
                }
            }

            if (Arrays.equals(carocultos, letras)) {
                fin = false;
                System.out.println("Ha ganado la frase es la misma");
            }
            if (intento == true) {
                i++;
                if (i < vidas) {
                    System.out.println("Le quedan  " + (vidas - i) + " vidas asi queda la frase por ahora:" + Arrays.toString(carocultos));
                }
                if (i == vidas) {
                    System.out.println("Has perdido todas las vidas");
                }
            }
            System.out.println("");
        }
    }
}
            
   
                
        
        
       
       
        



