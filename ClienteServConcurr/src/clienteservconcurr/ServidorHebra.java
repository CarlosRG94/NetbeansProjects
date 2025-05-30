/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservconcurr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author carli
 */
public class ServidorHebra extends Thread {

    private DataInputStream entrada;
    private DataOutputStream salida;
    private Socket socketcliente;

    public ServidorHebra(Socket socketcliente, DataInputStream entrada, DataOutputStream salida) {
        this.socketcliente = socketcliente;
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public void run() {
        boolean salir = true;
        String mensajerecibido;
        Random generador = new Random();

        while (salir) {
            try {
                //Pregunto al cliente qué quiero hacer
                salida.writeUTF("Servidor: que quieres hacer 1 número aleatorio 2 salir");

                //Recibo la respuesta del cliente
                mensajerecibido = entrada.readUTF();

                //Segun el mensaje recibido
                switch (mensajerecibido) {
                    case "1":
                        int aleatorio = generador.nextInt(500);
                        salida.writeUTF("Servidor: El número aleatorio generado es " + aleatorio);
                        break;
                    case "2":
                        System.out.println("Servidor: El cliente" + this.socketcliente + " envia salir.....");
                        System.out.println("Servidor: Cerrando la conexión...");
                        socketcliente.close();
                        System.out.println("Servidor: Conexión cerrada.");
                        salir = false;
                        break;

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        try {
            entrada.close();
            salida.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
