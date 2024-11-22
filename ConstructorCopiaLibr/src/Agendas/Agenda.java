package Agendas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carli
 */
public class Agenda {
    private String lunes, martes, miercoles, jueves, viernes;
    
    public Agenda(){
        lunes = "";
        martes = "";
        miercoles = "";
        jueves = "";
        viernes = "";
    }

    public Agenda(String lunes, String martes, String miercoles, String jueves, String viernes) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }
    public Agenda(Agenda agency) {
        this.lunes = agency.lunes;
        this.martes = agency.martes;
        this.miercoles = agency.miercoles;
        this.jueves = agency.jueves;
        this.viernes = agency.viernes;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }
    
    public void mostrarTarea(int numdia){
    switch (numdia){
        case 1: 
            System.out.println(lunes);
            break;
        case 2: 
            System.out.println(martes);
            break;
        case 3: 
            System.out.println(miercoles);
            break;
        case 4: 
            System.out.println(jueves);
            break;
        case 5: 
            System.out.println(viernes);
            break;
    }
    }
}
