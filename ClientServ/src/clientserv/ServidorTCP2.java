/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserv;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carli
 */
public class ServidorTCP2 {

    private final int PUERTO = 6666; //Puerto para la conexión

    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket serverSocket; //Socket del servidor

    protected DataOutputStream salidaServidor; //Flujo de datos de salida

    public static void main(String[] args) {
        ServidorTCP2 serv = new ServidorTCP2(); //Se crea el servidor
        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }

    public void startServer() {//Método para iniciar el servidor

        try {
            System.out.println("Esperando..."); //Esperando conexión

            serverSocket = new ServerSocket(PUERTO);//Se crea el socket para el servidor en puerto 1234
            while (true) {

                //Socket del cliente
                Socket clientSocket = serverSocket.accept(); //Accept comienza el socket y espera una conexión desde un cliente

                System.out.println("Cliente en línea");
                //Se obtiene el flujo de salida del cliente para enviarle mensajes
                DataOutputStream salidaCliente = new DataOutputStream(clientSocket.getOutputStream());

                //Se le envía un mensaje al cliente usando su flujo de salida
                salidaCliente.writeUTF("Petición recibida y aceptada");

                //Se obtiene el flujo entrante desde el cliente
                try (DataInputStream entrada = new DataInputStream(clientSocket.getInputStream())) {
                    while (true) {
                        mensajeServidor = entrada.readUTF(); // Lee mensajes usando readUTF()
                        System.out.println(mensajeServidor);

                    }
                } catch (IOException e) {
                    System.out.println("Cliente desconectado.");
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                System.out.println("Fin de la conexión");

                serverSocket.close();//Se finaliza la conexión con el cliente
            } catch (IOException ex) {
                Logger.getLogger(ServidorTCP2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
