/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author carli
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<FacturasIntrod> listaFacturas = listFactura();
        facturasIntroFiv(listaFacturas);
          
            }
    
    
    public static ArrayList<FacturasIntrod> listFactura(){
     Scanner teclado = new Scanner(System.in);
          ArrayList<FacturasIntrod> listaFacturas = new ArrayList();
          System.out.println("Introduzca el número de Facturas que quiere inlcuir a la lista");
          int numfac = teclado.nextInt();
 
            for (int i = 0; i < numfac; i++) {
          System.out.println("Por favor introduzca el codigo de producto: ");
        int codigo = teclado.nextInt();
                System.out.println("Introduzca la cantidad de litros vendidos:");
        int canlitros = teclado.nextInt();
                System.out.println("Introduzca el precio del litro:");
        int preciolitro = teclado.nextInt();
        
        FacturasIntrod factura = new FacturasIntrod(codigo, canlitros, preciolitro);
        listaFacturas.add(factura);
    
    }
            return listaFacturas;
}
      public static void facturasIntroFiv(ArrayList<FacturasIntrod> facturas) {
        double facturatotal = 0;
        int litrostotal1 = 0;
        int mas600 = 0;
        double precio;
        for (FacturasIntrod factura : facturas) {
            
            precio = factura.precioFact();
            facturatotal += precio;
            if (factura.getCodigo() == 1) {
                litrostotal1 += factura.getCantlitros();
            }
            if (precio > 600) {
                mas600++;
            }
        }
        System.out.println("Este es la factura total de las facturas" + facturatotal);
        System.out.println("Se han vendido "+ litrostotal1 + " del codigo uno");
        System.out.println("Se han vendido "+ mas600 + " unidades de mas de 600 euros ");
    }
}


