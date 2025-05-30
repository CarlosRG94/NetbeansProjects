/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpejemplo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author
 */
public class ClienteFTP03 {

    private final String urlFTP;
    private final String usuario;
    private final String pwd;
    private final int FTP_Port;

    public static void main(String[] args) {
        //Instancio la clase
        ClienteFTP03 clienteFtp = new ClienteFTP03();
        //Llamada a la función que ejecuta la lógica de conexión
        //Listar ficheros del servidor
        clienteFtp.subirFichero();
    }

    public ClienteFTP03() {
        //Parámetros de conexión
        //Ver info: https://www.wftpserver.com/onlinedemo.htm
        this.urlFTP = "demo.wftpserver.com";
        this.usuario = "demo";
        this.pwd = "demo";
        this.FTP_Port = 21;
    }

    
    private void subirFichero() {
        try {
            FTPClient ftp = new FTPClient();
            //1.Connect and login to the server.
            ftp.connect(this.urlFTP, this.FTP_Port);
            int codigoRespuesta = ftp.getReplyCode();
            //Según el código de respuesta, informo
            if (!FTPReply.isPositiveCompletion(codigoRespuesta)) {
                System.out.println("Error en la conexión");
                //Puedo lanzar excepción - finalizar
            } else {
                boolean isLoginOK = ftp.login(this.usuario, this.pwd);
                if (isLoginOK) {
                    System.out.println("Cliente logeado en el servidor");
                    //2.Enter local passive mode for data connection.
                    /*https://ccnadesdecero.es/diferencias-ftp-modo-activo-pasivo/#2_FTP_Modo_Pasivo*/
                    ftp.enterLocalPassiveMode();
                    //3.Set file type to be transferred to binary. 
                    ftp.setFileType(FTP.BINARY_FILE_TYPE);

                    //4.Create an InputStream for the local file.
                    File ficheroLocal = new File("C:\\Users\\MEDAC\\Downloads\\SFTP_SFTPFILE20241204.zip");
                    InputStream is = new FileInputStream(ficheroLocal);

                    //5.Construct path of the remote file on the server. The path can be absolute or relative to the current working directory.
                    String ficheroRemoto = "upload/SFTP_SFTPFILE20241204_14_30.zip";

                    //6.Call one of the storeXXX()methods to begin file transfer.
                    System.out.println("Inicio ... subiendo fichero");
                    boolean isDone = ftp.storeFile(ficheroRemoto, is);
                    
                    is.close();
                    if (isDone) {
                        System.out.println("Fichero subido correctamente.");
                    }
                    /*
                    https://demo.wftpserver.com/main.html/sort3
                    */

                   
                   
                } else {
                    System.out.println("Usuario o contraseña incorrectas");
                }
                //9.Logout and disconnect from the server.
                ftp.logout();
                System.out.println("... haciendo logout!");
                ftp.disconnect();
                System.out.println("... desconectando del servidor!");
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteFTP03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}