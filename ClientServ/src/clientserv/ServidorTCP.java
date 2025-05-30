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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ServidorTCP {

  private static final int PUERTO = 6000;
  private static final int MAX_CLIENTES = 3;
  
  public ServidorTCP(){
      try{
          //Creo el socket servidor que escucha en el puerto 6000
          ServerSocket skServidor = new ServerSocket(PUERTO);
          System.out.println("Escucho el puerto " + PUERTO);
          //Escucho a un cierto número de clientes
          for (int numCli = 0; numCli < MAX_CLIENTES; numCli++) {
              //Escucho a un cliente 
              Socket skCliente = skServidor.accept();
              //Cuando escucha un cliente da un aviso
              System.out.println("Sirvo al cliente" + numCli);
              InputStream aux = skCliente.getInputStream();
              DataInputStream flujo = new DataInputStream(aux);
              System.out.println("Mensaje recibido del cliente: ");
              System.out.println(flujo.readUTF());
              //Obtiene el flujo de salida del cliente
              //(Mensajes que envia al cliente)
              OutputStream os = skCliente.getOutputStream();
              DataOutputStream dos = new DataOutputStream(os);
              //Manda un mensaje al cliente
              dos.writeUTF("Hola cliente: " +numCli);
              //Cierro el socket servidor 
              skCliente.close();
          }
          System.out.println("Demasiado clientes por hoy");
      
      }catch(IOException e){
                System.out.println(e.getMessage());
      }
  }
    public static void main(String[] args) {
        new ServidorTCP();
    }
    
}
