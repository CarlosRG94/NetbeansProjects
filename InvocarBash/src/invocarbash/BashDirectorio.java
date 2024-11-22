/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invocarbash;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class BashDirectorio {
     public static void main(String[] args) {
         //Creamos un archivo con el directorio que quiero acceder, porque java esta en el directorio onedrive
         File directorioTrabajo = new File("C:\\Users\\carli");
        // Creamos el proceso hijo
        ProcessBuilder pb_echo = new ProcessBuilder("CMD");
        pb_echo.directory(directorioTrabajo);
        Process process_echo;
        Scanner sc = new Scanner(System.in);
         System.out.println("Introduce la ruta a la que quieres hacer un dir:");
         String ruta = sc.nextLine();
         
        try {
            process_echo = pb_echo.start();
               //Indicamos cuál es la salida del proceso hijo que ejecuta el bash
        final Scanner in = new Scanner(process_echo.getInputStream());
        new Thread(){
            @Override
            public void run(){
                      while (in.hasNextLine()) {
                          System.out.println(in.nextLine());
                      }  
            }
        }.start();
        
        //Obtenemos la salida del proceso hijo
        PrintWriter salida = new PrintWriter(process_echo.getOutputStream());
        
        //Hacemos 10 llamadas al proceso hijo con el comando echo
            
                salida.println("dir /A "+ ruta);
                salida.flush();
         
            //Cerramos los flujos
            salida.close();
        
        } catch (IOException ex) {
            System.err.println("Excepción de E/S:" + ex.toString());
        }
    }
}
