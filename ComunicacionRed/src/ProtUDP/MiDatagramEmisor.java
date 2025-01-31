/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import Constantes.Constantes;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author carli
 */
public class MiDatagramEmisor {

    private String host;
    private int port;

    public MiDatagramEmisor(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private void enviarMensaje(String mes) {
        try {
            byte[] data = mes.getBytes();
            InetAddress address = InetAddress.getByName(host);
            DatagramPacket pack = new DatagramPacket(data, data.length, address, port);
            DatagramSocket ds = new DatagramSocket();
            ds.send(pack);
            ds.close();

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        MiDatagramEmisor cliente = new MiDatagramEmisor(
                Constantes.EJEMPLO_01.HOST, Constantes.EJEMPLO_01.PUERTO);
        String message = "Emisor enviando dato.....";

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                cliente.enviarMensaje(message);
            }
        }, 1000, 1000);
    }
}
