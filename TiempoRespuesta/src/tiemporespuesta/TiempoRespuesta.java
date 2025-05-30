/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiemporespuesta;


import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author carli
 */
public class TiempoRespuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Date inicio = Calendar.getInstance().getTime();
            
            sleep(2000);
            
            Date fin = Calendar.getInstance().getTime();
            
            System.out.println("La diferencia en segundos es :" + diferenciaSegundosTiempo(inicio,fin))
                    ;
        }catch(InterruptedException ex){
            ex.getMessage();
        }
    }
    
    public static float diferenciaSegundosTiempo(Date inicio, Date fin){
    
        float diferencia = (float )((fin.getTime()/1000) - (inicio.getTime()/1000));
        if (diferencia > 60){
        diferencia = diferencia / 60;
        }
    return diferencia;
    }
    
}
