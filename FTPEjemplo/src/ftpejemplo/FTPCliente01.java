/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpejemplo;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author carli
 */
public class FTPCliente01 {
        
    private final String urlFTP;
    private final String usuario;
    private final String pwd;
    private final int FTP_Port;

    public static void main(String[] args) {
        FTPCliente01 cliente = new FTPCliente01();
        cliente.conexionFTP();
    }

    public FTPCliente01() {
        this.urlFTP = "demo.wftpserver.com";
        this.usuario = "demo";
        this.pwd = "demo";
        this.FTP_Port = 21;
    }

    public void conexionFTP() {
        try {
            FTPClient ftp = new FTPClient();
            //Realizo la conexión y recojo el código de respuesta del servidor
            System.out.println("Estableciendo la conexion con el servidor....");
            ftp.connect(this.urlFTP, this.FTP_Port);
            int codigoRespuesta = ftp.getReplyCode();
            //Según el codigo de respuesta, informo
            if (!FTPReply.isPositiveCompletion(codigoRespuesta)) {
                System.out.println("Error en la conexión");
            } else {
                boolean isLoginOk = ftp.login(usuario, pwd);
                if (isLoginOk) {
                    System.out.println("Cliente logeado en el servidor");
                } else {
                    System.out.println("Usuario o contraseña incorrectas");
                }
                //Finalizo la conexión y desconecto
                ftp.logout();
                System.out.println("haciendo logout");
                ftp.disconnect();
                System.out.println("desconectando del servidor");

            }

        } catch (IOException ex) {
            ex.getCause();
        }

    }
    
}
