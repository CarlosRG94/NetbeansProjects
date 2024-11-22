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
public class LanzarProcesoGoogle {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args)  {
        //Ruta del ejecutable
        String ruta = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el programa que quiere abrir pulse 1 para chrome 2 para el bloc y 3 calculadora");
        int num = sc.nextInt();
        
        switch(num){
            case 1:
                ruta = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
                break;
            case 2:
                ruta = "C:\\Windows\\system32\\notepad.exe";
                break;
            case 3:
                ruta = "C:\\Windows\\System32\\calc.exe";
                break;
        }
        
        //Creamos el proceso de google Chrome
        ProcessBuilder pb = new ProcessBuilder(ruta);
        try{
            //Lanzamos el proceso
            Process process = pb.start();
            //Obtenemos su estado de ejecución
            int retorno = process.waitFor();
            System.out.println("La ejecución de " + ruta + "devuelve" + retorno  );
            
        }catch (IOException ex){
            System.err.println("Error:"+ ex.toString());
            System.exit(-1);
        }catch(InterruptedException ex){
            System.err.println("El proceso hijo finalizó de forma incorrecta");
            System.exit(-1);
        }
                
    }
    
}
