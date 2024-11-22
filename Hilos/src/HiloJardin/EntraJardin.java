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
public class EntraJardin extends Thread {

    private final RecursoJardin jardin;

    public EntraJardin(String n, RecursoJardin rj) {
        this.setName(n);
        this.jardin = rj;
    }

    @Override
    public void run() {
        jardin.incrementa();
    }

}
