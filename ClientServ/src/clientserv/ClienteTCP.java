/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ClienteTCP {
    private static final String HOST = "localhost";
    private static final int PUERTO = 6000;
    public ClienteTCP(){
    try{
        Socket skCliente = new Socket(HOST,PUERTO);
         OutputStream os = skCliente.getOutputStream();
         DataOutputStream dos = new DataOutputStream(os);
              //Manda un mensaje al servidor
              dos.writeUTF("Gracias por servirme");
        InputStream aux = skCliente.getInputStream();
        DataInputStream flujo = new DataInputStream(aux);
        System.out.println("Mensaje recibido del servidor: ");
        System.out.println(flujo.readUTF());
       
        skCliente.close();
        
    } catch (IOException e){
        System.out.println("Error en el cliente:" + e.toString());
    }
    }
      public static void main(String[] args) {
        new ClienteTCP();
    }
}
