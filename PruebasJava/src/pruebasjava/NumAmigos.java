/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasjava;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class NumAmigos {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
                 Scanner teclado = new Scanner(System.in);
                 System.out.println("Por favor introduzca el primer número a comprobar");
                 int num1 = teclado.nextInt();
                 System.out.println("Por favor introduzca el segundo número a comprobar");
                int num2 = teclado.nextInt();
                int sum1 = sumDividendos(num1);
                int sum2 = sumDividendos(num2);
                if(sum1==sum2){
                     System.out.println("El número "+num1+" y el número " +num2+ " son amigos" );
                }else{
                     System.out.println("El número "+num1+" y el número " +num2+ " no son amigos");
                }    
         }
        public static int sumDividendos (int num){
             int sum = 0; 
             int i = 1;
             while(i<=num){
                    if(num%i==0){
                     sum+=i;
                     }
                     i++;
            }
            return sum;
        }
    
}
