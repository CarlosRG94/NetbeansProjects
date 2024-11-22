/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarmetodo;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class LanzarMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Dame un número:");
        n1 = teclado.nextInt();
        System.out.println("Dame otro número:");
        n2 = teclado.nextInt();
        
        try {
            int estado_ejecucion = ejecutarClaseProceso(Sumador.class, n1, n2);
            if (estado_ejecucion == 0) {
                System.out.println("Proceso ejecutado correctamente");
            } else {
                System.out.println("Error ejecutando el proceso");
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("Error:"+ ex.toString());
            System.exit(-1);
        }
    }
    
    public static int ejecutarClaseProceso( Class clase, int n1, int n2) throws InterruptedException, IOException{
            //Defino dónde está el java home
            String javaHome = System.getProperty("java.home");
            //Defino dónde está el bin de java
            String javaBin = javaHome+File.separator+"bin"+File.separator+"java";
            //Defino el path de java
            String classPath = System.getProperty("java.class.path");
            //Obtengo el nombre canónico de la clase que se va a ejecutar
            String className = clase.getCanonicalName();
            //Creo el proceso a ejecutar
            //Los dos últimos parámetros son los parámetros del método main de la clase
            ProcessBuilder pb = new ProcessBuilder(javaBin, "-cp", classPath, className, String.valueOf(n1), String.valueOf(n2) );
            //Indico cual va a ser la salida de errores del proceso puede ser un fichero o por pantalla
            //builder.redirectError(new File("errores.txt"))
            pb.redirectError(Redirect.INHERIT);
            //Indico cual va a ser la salida del proceso en este caso tambien lo hacemos por pantalla pero podria ser en un fichero
            pb.redirectOutput(Redirect.INHERIT);
            Process process = pb.start();
           
            //Espero a que se ejecute el proceso
            process.waitFor();
            return process.exitValue();
    }
    
}
