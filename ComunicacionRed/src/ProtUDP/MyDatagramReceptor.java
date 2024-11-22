/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtUDP;

import java.net.DatagramSocket;
import Constantes.Constantes;
import java.io.IOException;
import java.net.DatagramPacket;
/**
 *
 * @author carli
 */
public class MyDatagramReceptor {
    public static void main(String[] args) {
        try {
            System.out.println("Receptor escuchando....");
            //Clase servidor basado en DatagramSocket para recibir datos
            DatagramSocket ds = new DatagramSocket(Constantes.EJEMPLO_01.PUERTO);
            
            while(Boolean.TRUE){
                //Recogemos el paquete de datos
                //Constructo de DatagramPacket para recibir paquetes de una longitud que son los bytes
                DatagramPacket pack = new DatagramPacket(
                new byte[Constantes.EJEMPLO_01.NUM_BYTES],
                Constantes.EJEMPLO_01.NUM_BYTES);
                //Recibe un paquete datagram desde el socket
                ds.receive(pack);
                //Muestra los datos por consola 
                System.out.println(new String(pack.getData()));
                
        }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
