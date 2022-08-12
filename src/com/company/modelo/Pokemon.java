package com.company.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nombre;
    private float vida;
    private float velocidad;
    private float precision;
    private float defensa;

    private List<Ataque> ataques;

    public Pokemon(String nombre, float vida, float velocidad, float precision, float defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.velocidad = velocidad;
        this.precision = precision;
        this.defensa = defensa;
        this.ataques = new ArrayList<>();
    }

    public float atacar(Ataque unAtaque, Pokemon enemigo){
        float danio=0;
        if (enemigo.getVida()>0){
            danio = unAtaque.getDanio();
            danio = (danio * this.precision) / 100;
            danio = danio - enemigo.getDefensa();
        }
        return danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getPrecision() {
        return precision;
    }

    public void setPrecision(float precision) {
        this.precision = precision;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }
}
