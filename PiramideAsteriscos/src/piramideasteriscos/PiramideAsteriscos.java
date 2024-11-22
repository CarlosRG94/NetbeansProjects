/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramideasteriscos;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class PiramideAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca la altura de la piramide");
        int altura = teclado.nextInt();
        showPyramid(altura);
    }
    public static void showPyramid(int altura){
        
        for(int i = 1; i<= altura; i++){
            for(int blanco = 1; blanco<= altura-i;blanco++ ){
                System.out.print(" ");
            }
            for(int aster = 1; aster<=i*2; aster++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
