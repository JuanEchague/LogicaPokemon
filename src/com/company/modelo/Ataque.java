package com.company.modelo;

public class Ataque {
    private String nombre;
    private float danio;

    public Ataque(String nombre, float danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDanio() {
        return danio;
    }

    public void setDanio(float danio) {
        this.danio = danio;
    }
}
