/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class FacturasIntrod {

    private int codigo;
    private int cantlitros;
    private int preciolitro;

    public FacturasIntrod(int codigo, int cantlitros, int preciolitro) {
        this.codigo = codigo;
        this.cantlitros = cantlitros;
        this.preciolitro = preciolitro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantlitros() {
        return cantlitros;
    }

    public void setCantlitros(int cantlitros) {
        this.cantlitros = cantlitros;
    }

    public int getPreciolitro() {
        return preciolitro;
    }

    public void setPreciolitro(int preciolitro) {
        this.preciolitro = preciolitro;
    }
    

    public double precioFact() {
        double preciofac;
        preciofac = cantlitros * preciolitro;
        return preciofac;
    }

  
}
      
    
    
    
