package com.mycompany.gamemario;

import com.mycompany.criandoelevador.Elevador;
import com.mycompany.criandoelevador.EstadoDescendo;
import com.mycompany.criandoelevador.EstadoParado;
import com.mycompany.criandoelevador.EstadoSubindo;
import com.mycompany.criandoelevador.IEstado;

public class MarioCapa implements IMarioState{
    private Mario mario;
    
    public MarioCapa(Mario mario){
        this.mario = mario;
    }
    public IMarioState pegarCogumelo(){
        System.out.println("Mario ganhou 1000 pontos");
        mario.ganharPontos(1000);
        return this;
    }
    public IMarioState pegarFlor(){
        System.out.println("Mario ficou com fogo");
        mario.ganharPontos(1000);
        return new MarioFogo(mario);
    }
    public IMarioState pegarPena(){
        System.out.println("Mario ganhou 1000 pontos");
        mario.ganharPontos(1000);
        return this;
    }
    public IMarioState levarDano(){       
        System.out.println("Mario ficou pequeno e perdeu 1000 pontos");
        mario.perderPontos(1000);
        return new MarioPequeno(mario);
    }
    
    public IEstado subir(Elevador e) {
        System.out.println("MarioCapa esta subindo no elevador.");      
        return new EstadoSubindo();
    }

    public IEstado descer(Elevador e) {
        System.out.println("MarioCapa esta descendo no elevador.");       
        return new EstadoDescendo();
    }
 
    public IEstado parar(Elevador e) {
        System.out.println("MarioCapa parou o elevador parou.");    
        return new EstadoParado();
    }
}
