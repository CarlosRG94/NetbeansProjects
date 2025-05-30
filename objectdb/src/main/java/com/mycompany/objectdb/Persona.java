package com.mycompany.objectdb;



@Entity
public class Persona {

    @Id
    private Long id;
    private String nombre;
    private int edad;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(Long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
