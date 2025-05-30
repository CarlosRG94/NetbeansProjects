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
public class ServidorCalculadora {
    public static void main(String[] args) {
        int puerto = 1222;

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciado...");

            while (true) {
                try (Socket clienteSocket = serverSocket.accept();
                     DataInputStream in = new DataInputStream(clienteSocket.getInputStream());
                     DataOutputStream out = new DataOutputStream(clienteSocket.getOutputStream())) {

                    // Leer el primer número
                    String num1Str = in.readUTF();
                    double num1 = Double.parseDouble(num1Str);

                    // Leer el segundo número
                    String num2Str = in.readUTF();
                    double num2 = Double.parseDouble(num2Str);

                    // Leer el operador
                    String operador = in.readUTF();
                      out.writeUTF("Mensaje en mitad");

                    // Realizar la operación
                    double resultado = 0;
                    switch (operador) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                out.writeUTF("Error: División por cero");
                                continue;
                            }
                            break;
                        default:
                            out.writeUTF("Error: Operador no válido");
                            continue;
                    }

                    // Enviar el resultado al cliente
                    out.writeUTF("Resultado: " + resultado);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
