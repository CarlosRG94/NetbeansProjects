/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmadigitalrsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

/**
 *
 * @author carli
 */
public class FirmaDigitalRsa {
    
    private PrivateKey clavePrivada;
    private PublicKey clavePublica;

    // 1. Generar par de claves RSA
    public void generarClaves() throws NoSuchAlgorithmException {
        KeyPairGenerator generadorClaves = KeyPairGenerator.getInstance("RSA");
        generadorClaves.initialize(2048); // Longitud de clave segura
        KeyPair parDeClaves = generadorClaves.generateKeyPair();
        clavePrivada = parDeClaves.getPrivate();
        clavePublica = parDeClaves.getPublic();
    }

    // 2. Firmar un mensaje con la clave privada
    public String firmarMensaje(String mensaje) throws Exception {
        Signature firma = Signature.getInstance("SHA256withRSA");
        firma.initSign(clavePrivada);
        firma.update(mensaje.getBytes());
        byte[] firmaDigital = firma.sign();
        return Base64.getEncoder().encodeToString(firmaDigital); // Convertir a Base64 para fácil manejo
    }

    // 3. Verificar la firma con la clave pública
    public boolean verificarFirma(String mensaje, String firmaRecibida) throws Exception {
        Signature firma = Signature.getInstance("SHA256withRSA");
        firma.initVerify(clavePublica);
        firma.update(mensaje.getBytes());
        byte[] firmaBytes = Base64.getDecoder().decode(firmaRecibida);
        return firma.verify(firmaBytes);
    }

    // 4. Prueba del proceso de firma digital
    public static void main(String[] args) {
        try {
            FirmaDigitalRsa firmaDigital = new FirmaDigitalRsa();

            // Generar claves
            firmaDigital.generarClaves();

            // Mensaje a firmar
            String mensaje = "Este es un mensaje seguro";

            // Firmar el mensaje
            String firma = firmaDigital.firmarMensaje(mensaje);
            System.out.println("Mensaje: " + mensaje);
            System.out.println("Firma digital: " + firma);

            // Verificar la firma
            boolean esValida = firmaDigital.verificarFirma(mensaje, firma);
            System.out.println("¿Firma válida? " + esValida);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
