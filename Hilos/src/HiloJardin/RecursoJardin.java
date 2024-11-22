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
public class RecursoJardin {

    private int cuenta = 0;

    public RecursoJardin() {
        this.cuenta = 100;
    }

    public synchronized void incrementa() {
        System.out.println("Hilo " + Thread.currentThread().getName());
        this.cuenta = this.cuenta + 1;
        System.out.println(this.cuenta + "en el jardin" + Thread.currentThread().getName());

    }

    public synchronized void decrementa() {
        System.out.println("Hilo " + Thread.currentThread().getName());
        this.cuenta = this.cuenta - 1;
        System.out.println(this.cuenta + "en el jardin" + Thread.currentThread().getName());

    }
}
