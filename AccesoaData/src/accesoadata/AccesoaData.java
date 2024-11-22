/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class AccesoaData { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File fichero = new File("C:/Users/carli/Documents/miArchivo.txt");
        
        try{
            if (fichero.createNewFile()) {
                System.out.println("Archivo creado:"+ fichero.getAbsolutePath());
            }else {
                System.out.println("El archivo ya existe.");
            }
            FileWriter escritor = new FileWriter(fichero);
            escritor.write("¡Hola, este es el contenido del archivo!");
            escritor.close();
            System.out.println("Se ha escrito en el archivo.");
            
            
        } catch (IOException e ){
            System.out.println("Ocurrio un error.");
            e.printStackTrace();
        }
        //Ahora vamos a mover el fichero a otra carpeta
        try {
            File fileOrigen = new File ("C:/Users/carli/Documents/miArchivo.txt");
            File fileDestino = new File("C:/Users/carli/Documents/Primero Dam/miArchivo.txt");
            if (fileOrigen.renameTo(fileDestino)) {
                System.out.println("El fichero se movió correctamente" + fileDestino.getAbsolutePath());
            }else{
                System.out.println("El fichero no pudo moverse");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
             InputStream entrada = new FileInputStream("C:/Users/carli/Documents/Primero Dam/miArchivo.txt");
             int data = entrada.read();
             System.out.println("Este es el primer byte"+ (char)data);
             entrada.close();
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       
        
    }
    
}
