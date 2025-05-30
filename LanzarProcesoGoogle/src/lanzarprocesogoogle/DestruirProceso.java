/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarprocesogoogle;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class DestruirProceso {
     public static void main(String[] args)  {
        //Ruta del ejecutable de google chrome
        String Ruta_Proceso = "C:\\Windows\\system32\\notepad.exe";
        
        //Creamos el proceso de google Chrome
        ProcessBuilder pb = new ProcessBuilder(Ruta_Proceso);
        Scanner teclado = new Scanner(System.in);
        
        try{
            Process process = pb.start();
            System.out.println("Terminar el proceso (S/N)");
            if(teclado.nextLine().charAt(0) == 'S'){
                        process.destroy();
            }
                        
             }catch (IOException ex){
                 System.err.println("Error:"+ ex.toString());
             }            
        }
}
