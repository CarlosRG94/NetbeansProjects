/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ServidorTCP3 {
     public static void main(String[] args) {
        int puerto = 1234;

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciado...");

            while (true) {
                try (Socket clienteSocket = serverSocket.accept();
                     DataInputStream in = new DataInputStream(clienteSocket.getInputStream());
                     DataOutputStream out = new DataOutputStream(clienteSocket.getOutputStream())) {

                    String mensaje;
                    while (!(mensaje = in.readUTF()).equalsIgnoreCase("salir")) {
                        System.out.println("Cliente: " + mensaje);

                        // Enviar respuesta al cliente
                        out.writeUTF("Mensaje recibido: " + mensaje);
                    }

                    System.out.println("Cliente desconectado.");
                    clienteSocket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
