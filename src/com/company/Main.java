package com.company;

import com.company.modelo.Ataque;
import com.company.modelo.Pokemon;

public class Main {

    public static void main(String[] args) {

        //Creacion de Objetos

        Pokemon player1 = new Pokemon("picachu",80f,200f,80f,15f );

        Ataque a1 = new Ataque("impact trueno", 50f);
        Ataque a2 = new Ataque("golpe cabeza", 30f);
        Ataque a3 = new Ataque("ataque rapido", 40f);

        player1.getAtaques().add(a1);
        player1.getAtaques().add(a2);
        player1.getAtaques().add(a3);


        Pokemon player2 = new Pokemon("charizard",300f,70f,60f,15f );

        Ataque a4 = new Ataque("Lanza llamas", 30f);
        Ataque a5 = new Ataque("patada", 25f);

        player2.getAtaques().add(a4);
        player2.getAtaques().add(a5);

//Seleccion de personajes


        System.out.println("Pokemon A");
        System.out.println("nombre: "+player1.getNombre());
        System.out.println("vida: "+player1.getVida());
        System.out.println("velocidad: "+player1.getVelocidad());
        System.out.println("precision: "+player1.getPrecision());
        System.out.println("defensa: "+player1.getDefensa());
        System.out.println("Ataques");

        for (Ataque ar: player1.getAtaques()) {
            System.out.println("nombre Ataque: "+ar.getNombre());
            System.out.println("danio Ataque: "+ar.getDanio());
        }

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("Pokemon B");
        System.out.println("nombre: "+player2.getNombre());
        System.out.println("vida: "+player2.getVida());
        System.out.println("velocidad: "+player2.getVelocidad());
        System.out.println("precision: "+player2.getPrecision());
        System.out.println("defensa: "+player2.getDefensa());
        System.out.println("Ataques");

        for (Ataque ar: player2.getAtaques()) {
            System.out.println("nombre Ataque: "+ar.getNombre());
            System.out.println("danio Ataque: "+ar.getDanio());
        }
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("Round Two");
        //Luchar
        if (player1.getVelocidad()>player2.getVelocidad()){
            System.out.println("Ataque: "+ player1.getAtaques().get(0).getNombre());
            System.out.println("danio: "+ player1.getAtaques().get(0).getDanio());
            float danio= player1.atacar(player1.getAtaques().get(0),player2);
            player2.setVida(player2.getVida()-danio);
            System.out.println("danio real: " +danio);
        }else{
            System.out.println("Ataque: "+ player2.getAtaques().get(0).getNombre());
            System.out.println("danio: "+ player2.getAtaques().get(0).getDanio());
            float danio= player2.atacar(player2.getAtaques().get(0),player1);
            player1.setVida(player1.getVida()-danio);
            System.out.println("danio real: " +danio);
        }

        System.out.println("Estado luego del primer golpe");
        System.out.println("--------------------------------");
        System.out.println("Pokemon A");
        System.out.println("nombre: "+player1.getNombre());
        System.out.println("vida: "+player1.getVida());
        System.out.println("--------------------------------");
        System.out.println("Pokemon B");
        System.out.println("nombre: "+player2.getNombre());
        System.out.println("vida: "+player2.getVida());

    }
}
