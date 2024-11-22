/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca el número a comprobar: ");
        int nume = teclado.nextInt();
    NumerosCapicuos num = new NumerosCapicuos(nume);
    num.sacarUnid();
    num.compararNum();
        
}
   
}
         

    

                                                     

    
