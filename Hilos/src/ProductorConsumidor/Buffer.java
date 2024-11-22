/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

/**
 *
 * @author carli
 */
public class Buffer {
    private int contenido = 0;
    
    public int get(){
    return contenido;
    }
    
    public void put (int value){
    contenido= value;
    }
}
