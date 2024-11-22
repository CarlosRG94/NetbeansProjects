/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numalreves;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class NumAlReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
                 System.out.println("Por favor introduzca el primer número a comprobar mayor a 9 y menor que 100000");
                 int num1 = teclado.nextInt();
                 int nummil,numcent,numdec,decmil,num;
                 if (num1>= 10000) {
                     decmil=num1/10000;
                     num1= num1%10000;
                     nummil =num1/1000;
                     num1 =num1%1000;
                     numcent=num1/100;
                     num1 = num1%100;
                     numdec = num1/10;
                     num1 = num1%10;
                     num = num1;
                System.out.println("El número en el orden contrario es"+ num  +numdec +numcent +nummil + decmil);
                }
               else  if (num1>=1000 && num1<9999) {
                    nummil =num1/1000;
                     num1 =num1%1000;
                     numcent=num1/100;
                     num1 = num1%100;
                     numdec = num1/10;
                     num1 = num1%10;
                     num = num1;
                System.out.println("El número en el orden contrario es"+num +numdec +numcent +nummil);
                }
                 else if(num1>=100 && num1<1000){
                    numcent=num1/100;
                     num1 = num1%100;
                     numdec = num1/10;
                     num1 = num1%10;
                     num = num1;
                   System.out.println("El número en el orden contrario es"+ num  +numdec +numcent);
                }
                 else if(num1>=10 && num1<100){
                   numdec = num1/10;
                     num1 = num1%10;
                     num = num1;
                   System.out.println("El número en el orden contrario es"+ num+numdec);
                }
    }
    
}
