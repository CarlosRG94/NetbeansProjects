/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaHelp;

import javax.help.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.net.URL;

/**
 *
 * @author carli
 */
public class Java_Help {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Ayuda");
        JButton helpButton = new JButton("Mostrar Ayuda");

        // Configuración de JavaHelp
        try {
            // Ruta al archivo HelpSet
           String helpSetPath = "/help/helpset.hs"; // Ruta ajustada para la raíz del proyecto
            HelpSet helpSet = new HelpSet(null, Java_Help.class.getResource(helpSetPath));

            HelpBroker helpBroker = helpSet.createHelpBroker();

            // Asociar la ayuda al botón
            helpButton.addActionListener(e -> helpBroker.setDisplayed(true));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Configuración de la ventana
        frame.add(helpButton);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
