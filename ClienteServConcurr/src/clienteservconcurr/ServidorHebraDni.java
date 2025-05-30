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
public class ServidorHebraDni extends Thread {

    private DataInputStream entrada;
    private DataOutputStream salida;
    private Socket socketcliente;
    
    public ServidorHebraDni(){
    }

    public ServidorHebraDni(Socket socketcliente, DataInputStream entrada, DataOutputStream salida) {
        this.socketcliente = socketcliente;
        this.entrada = entrada;
        this.salida = salida;
    }
      public char calculoLetra(int numdni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra;
        int numindice;
        numindice = numdni % 23;
        letra = letras[numindice];
        return letra;
    }

    @Override
    public void run() {
        boolean salir = true;
        String mensajerecibido;

        while (salir) {
            try {
                //Pregunto al cliente qué quiero hacer
                salida.writeUTF("Servidor: que quieres hacer 1: generar letra DNI 2: salir");

                //Recibo la respuesta del cliente
                mensajerecibido = entrada.readUTF();

                //Segun el mensaje recibido
                switch(mensajerecibido){
                    case"1":
                    salida.writeUTF("Introduce los números del dni");
                        int numRecibido = entrada.readInt();
                        ServidorHebraDni dni = new ServidorHebraDni();
                       char ch =  dni.calculoLetra(numRecibido);
                        salida.writeUTF("Servidor: La letra para el DNI "+ numRecibido +" es " +  ch );
                        break;
                        case"2":
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
