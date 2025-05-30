/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author carli
 */
public class HttpClient {
    public static void main(String[] args) {
        try {
            // Definimos la URL del servidor local
            URL url = new URL("http://localhost:9001/");
            
            // Abrimos la conexión a la URL
            URLConnection urlConnection = url.openConnection();
            
            // Establecemos que queremos leer datos de la respuesta
            urlConnection.setDoInput(true);
            
            // Usamos BufferedReader para leer la respuesta del servidor línea por línea
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            // Cerramos el BufferedReader
            in.close();
            
            // Imprimimos la respuesta recibida del servidor
            System.out.println("Response from server: " + response.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
