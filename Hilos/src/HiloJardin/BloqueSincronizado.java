/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiloJardin;

/**
 *
 * @author carli
 */
public class BloqueSincronizado {

    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();

        for (int i = 1; i <= 10; i++) {
            EntraJardin ej = new EntraJardin("Entra" + i, jardin);
            ej.start();
        }

        for (int i = 1; i <= 15; i++) {
            SalidaJardin ej = new SalidaJardin("Sale" + i, jardin);
            ej.start();
        }
    }
}
