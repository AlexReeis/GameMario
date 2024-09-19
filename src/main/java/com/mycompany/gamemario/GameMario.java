package com.mycompany.gamemario;
import com.mycompany.criandoelevador.Elevador;

public class GameMario {

    public static void main(String[] args) {
        
       Mario mario = new Mario();
       Elevador elevador = new Elevador();
        
       mario.pegarCogumelo();
       mario.levarDano();
       mario.pegarFlor();
            
       mario.subir();
       mario.levarDano();
       mario.pegarPena();
       mario.parar();
    }
}
