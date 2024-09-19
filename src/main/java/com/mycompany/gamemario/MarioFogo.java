package com.mycompany.gamemario;

import com.mycompany.criandoelevador.Elevador;
import com.mycompany.criandoelevador.EstadoDescendo;
import com.mycompany.criandoelevador.EstadoParado;
import com.mycompany.criandoelevador.EstadoSubindo;
import com.mycompany.criandoelevador.IEstado;

public class MarioFogo implements IMarioState {
     private Mario mario;
    
    public MarioFogo(Mario mario){
        this.mario = mario;
    }
     public IMarioState pegarCogumelo(){
        System.out.println("Mario ganhou 1000 pontos");
        mario.ganharPontos(1000);
        return this;
    }
    public IMarioState pegarFlor(){
        System.out.println("Mario ganhou 1000 pontos");
        mario.ganharPontos(1000);
        return this;
    }
    public IMarioState pegarPena(){
        System.out.println("Mario ganhou capa");
        mario.ganharPontos(1000);
        return new MarioCapa(mario);
    }
    public IMarioState levarDano(){
       System.out.println("Mario ficou pequeno e perdeu 1000 pontos");
        mario.perderPontos(1000);
        return new MarioPequeno(mario);
    }
    
     public IEstado subir(Elevador e) {
        System.out.println("MarioFogo esta subindo no elevador.");      
        return new EstadoSubindo();
    }

    public IEstado descer(Elevador e) {
        System.out.println("MarioFogo esta descendo no elevador.");       
        return new EstadoDescendo();
    }
 
    public IEstado parar(Elevador e) {
        System.out.println("MarioFogo parou o elevador parou.");    
        return new EstadoParado();
    }
}
