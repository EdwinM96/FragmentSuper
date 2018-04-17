package com.example.rafaj.fragmentapp;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String edad;
    private String imagen;

    public Persona() {
    }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, String edad, String imagen) {
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
