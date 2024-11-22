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
public class HiloSaluda extends Thread {

    private int num;

    public HiloSaluda(String saludo, int num) {
        this.setName(saludo);
        this.num = num;
    }

    @Override
    public void run() {
        try {
            sleep(this.num);
            System.out.println("Saludo desde hilo" + this.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
