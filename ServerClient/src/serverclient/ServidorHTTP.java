/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclient;



import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author carli
 */
public class ServidorHTTP {

    public static void main(String[] args) {
        try{
                final int PUERTO = 9001;
                /**
                 * En el contexto de las redes informáticas, backlog se refiere al número máximo de conexiones pendientes que un servidor puede
                 * manejar en un momento dado. Si llega al número máximo de conexiones permitidas, entonces la solicitud de conexión se 
                 * coloca en una cola o backlog
                 */
                HttpServer server = HttpServer.create(new InetSocketAddress(PUERTO), 0);
                
                System.out.println("Servidor arrancado..... esperando peticiones");
                
                HttpContext contexto = server.createContext("/");
                
                contexto.setHandler(ServidorHTTP :: gestionar) ;
                
                server.start();
                
        } catch (IOException ex) {
            Logger.getLogger(ServidorHTTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Funcion encargada gestionar el contexto o mapeo de datos de la URL
     * @param exchange
     */
    private static void gestionar(HttpExchange exchange){
                try{
                       int RESPONSE_COD = 200;
                       String response_msg = "<h1>Hola mundo desde el servidor<h1>"
                               + "<div>este es el segundo mensaje<div>";
                       
                       exchange.sendResponseHeaders(RESPONSE_COD, response_msg.getBytes().length);
                       OutputStream os = exchange.getResponseBody();
                       os.write(response_msg.getBytes());
                       os.close();
                       
                       leerParametrosEnviados(exchange);
                       
                } catch (IOException ex) {
            Logger.getLogger(ServidorHTTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void leerParametrosEnviados(HttpExchange exchange) {
        System.out.println(exchange.getRequestURI());
    }
    
}
