/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCrearHiloThread;

/**
 *
 * @author carli
 */
public class HiloCuentaAtras implements Runnable {

    private int cuenta = 10;
    private int id = 0;

    public HiloCuentaAtras(int c) {
        this.cuenta = c;
        this.id = (int) (Math.random() * 101);
    }

    @Override
    public void run() {
        while (this.cuenta > 0) {
            System.out.println("#" + id + "# valor (" + this.cuenta + ")" + "Hilo en ejecucion: " + Thread.currentThread().getName());
            this.cuenta = this.cuenta - 1;
        }
    }

}
