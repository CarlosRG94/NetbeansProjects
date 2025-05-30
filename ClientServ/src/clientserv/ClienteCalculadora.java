/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ClienteCalculadora {
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 1222;

        try (Socket socket = new Socket(host, puerto);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream())) {
               Scanner sc = new Scanner(System.in);
             System.out.println("Introduce el primer número");
            String num1 = sc.nextLine();
             System.out.println("Introduce el segundo número");
            String num2 = sc.nextLine();
             System.out.println("Introduce operador");
            String operd = sc.nextLine();
            // Enviar el primer número
            out.writeUTF(num1);
            // Enviar el segundo número
            out.writeUTF(num2);
            // Enviar el operador
            out.writeUTF(operd);
            
             String respuesta2 = in.readUTF();
            System.out.println("Respuesta del servidor: " + respuesta2);
            // Leer la respuesta del servidor
            String respuesta = in.readUTF();
            System.out.println("Respuesta del servidor: " + respuesta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
