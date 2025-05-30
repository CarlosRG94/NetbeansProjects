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
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ClienteTCP3{ 
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 1234;

        try (Socket socket = new Socket(host, puerto);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream())) {

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String mensaje;

            while (true) {
                System.out.print("Escribe un mensaje (o 'salir' para terminar): ");
                mensaje = teclado.readLine();

                // Enviar mensaje al servidor
                out.writeUTF(mensaje);

                if (mensaje.equalsIgnoreCase("salir")) {
                    break;
                }

                // Leer respuesta del servidor
                String respuesta = in.readUTF();
                System.out.println("Servidor: " + respuesta);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}