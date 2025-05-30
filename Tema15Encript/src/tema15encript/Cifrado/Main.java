/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema15encript.Cifrado;

import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author carli
 */
public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        String clavePrivada = "en1LugarD3LaMancha";
        
        String textoPlano = "Esto es un texto con datos privados";
        
        //String iv = "0123456789ABCDEF";
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);        
        
        
        StringEncrypt util = new StringEncrypt();
        String textoEncriptado = util.encriptar(clavePrivada, iv, textoPlano);
        String resultado = String.format("Texto encriptado {%s}", textoEncriptado);
        System.out.println(resultado);
        
        String textoDesencriptado = util.desencriptar(clavePrivada, iv, textoEncriptado);
        String resultado2 =String.format("Texto plano {%s}", textoDesencriptado); 
        System.out.println(resultado2);
        
                
    }
}
