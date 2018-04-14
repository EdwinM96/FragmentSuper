package com.example.rafaj.fragmentapp;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String edad;
    private int imagen;

    public Persona() {
    }

    public Persona(String nombre, String edad, int imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
