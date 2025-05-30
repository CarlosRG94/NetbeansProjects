/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservconcurr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            String host = "localhost";
            int puerto = 5056;

            //Obtengo la IP real
            InetAddress ip = InetAddress.getByName(host);

            System.out.println("Cliente: Conectando con " + host + ":" + puerto + "....");

            // Establezco la conexión con la IP y el puerto
            Socket socket = new Socket(ip, puerto);

            System.out.println("Cliente : Conexión establecida.");

            //Obtengo los flujos de entrada y salida
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());

            //Este es el bucle que va a permitir la comunicación entre el cliente y el cliente hebra
            boolean salir = false;
            Scanner teclado_String = new Scanner(System.in);
            while (!salir) {
                //Imprimo el mensaje del cliente
                System.out.println(entrada.readUTF());
                //Leo la respuesta y la envio (Si quiero número aleatorio o salir)
                String textoenviar = teclado_String.next();
                salida.writeUTF(textoenviar);

                switch (textoenviar) {
                    case "1":
                        String mensajerecibido = entrada.readUTF();
                        System.out.println(mensajerecibido);
                        break;
                    case "2":
                        System.out.println("Cliente cerrando la conexión");
                        socket.close();
                        System.out.println("Cliente conexión cerrada");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;

                }
            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
