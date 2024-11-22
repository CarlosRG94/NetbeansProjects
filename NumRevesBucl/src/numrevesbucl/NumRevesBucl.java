/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numrevesbucl;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class NumRevesBucl {

    /**
     * @param args the command line arguments
     */
            public static void main(String[] args) {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Por favor introduzca el primer número a comprobar mayor a 9 y menor que 100000");
                    int num1 = teclado.nextInt();
                 
                    int numcifra = cifraRet(num1);
                    showNumbers(numcifra,num1);
           }
    
           public static int cifraRet (int num1){
                     int cifra = 0;
                     if (num1>= 10000) {
                             cifra = 5;
                      } else  if (num1>=1000 && num1<9999) {
                             cifra = 4;
                      }else if(num1>=100 && num1<1000){
                             cifra = 3; 
                      }else if(num1>=10 && num1<100){
                            cifra = 2;
                      }
                 return cifra;
           }
     
           public static void showNumbers(int cifra, int num1){
                      int []array = new int [cifra];
                      int i = 0;
                      while (i<cifra) {                         
                         array[i] = num1%10;
                         num1 /= 10;
                         i++;
                      }
                     
                      System.out.print("Este es el número al revés: ");
                     
                      for (int j = 0; j < cifra; j++) {
                       System.out.print(+ array[j] );
                      }
           }
    
}
