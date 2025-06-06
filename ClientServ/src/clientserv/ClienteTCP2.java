/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserv;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ClienteTCP2 {

    private final String HOST = "localhost"; //Host para la conexión
    private final int PUERTO = 6666; //Puerto para la conexión

    public void startClient() //Método para iniciar el cliente
    {
        try {
            //Socket del cliente
            Socket clientSocket = new Socket(HOST, PUERTO); //Socket para el cliente en localhost en puerto 1234

            //Flujo de datos hacia el servidor
            DataOutputStream salidaServidor = new DataOutputStream(clientSocket.getOutputStream());

            //Se enviarán dos mensajes
            for (int i = 0; i < 5; i++) {
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i + 1) + "\n");
            }

            clientSocket.close();//Fin de la conexión

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ClienteTCP2 cli = new ClienteTCP2(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
}
