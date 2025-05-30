/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketseguro;

/**
 *
 * @author 
 */
public class Main {
    public static void main(String[] args) {
        try {
            new SSLServidor(5557).arrancarServidor();
            new SSLCliente("localhost",5557).lanzarCliente();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
