/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservconcurr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author carli
 */
public class ServidorDni {
      public static void main(String[] args) {
        try {
            ServerSocket socketservidor = new ServerSocket(5058);
            System.out.println("Servidor escuchando en el localhost :5058");

            while (true) {
                Socket socketcliente = null;

                try {
                    //Espero a que conecte un nuevo cliente
                    socketcliente = socketservidor.accept();

                    System.out.println("Servidor: Cliente nuevo conectado: " + socketcliente);

                    //Obtengo los flujos de entrada y salida del socket cliente
                    DataInputStream entrada = new DataInputStream(socketcliente.getInputStream());
                    DataOutputStream salida = new DataOutputStream(socketcliente.getOutputStream());

                    System.out.println("Servidor: Creando una hebra nueva para el cliente nuevo.....");

                    //Creo una hebra para el cliente que se ha conectado
                    Thread clientehebraDni = new ServidorHebraDni(socketcliente, entrada, salida);
                    //Lanzo la hebra del cliente
                    clientehebraDni.start();

                    System.out.println("Servidor: Hebra del cliente nuevo creada, me despreocupo");

                } catch (IOException e) {
                    socketcliente.close();
                    e.getMessage();

                }

            }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
}
