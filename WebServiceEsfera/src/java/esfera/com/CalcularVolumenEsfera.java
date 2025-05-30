/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera.com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carli
 */
@WebService(serviceName = "CalcularVolumenEsfera")
public class CalcularVolumenEsfera {

    /**
     * Servicio web que calcula el volumen de una esfera
     * @param radio Radio de la esfera
     * @return Volumen de la esfera
     */
    @WebMethod(operationName = "volumen")
    public Double calcularVolumen(@WebParam(name = "radio") Double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}