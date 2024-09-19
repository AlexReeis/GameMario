package com.mycompany.gamemario;
import com.mycompany.criandoelevador.Elevador;
import com.mycompany.criandoelevador.IEstado;

public interface IMarioState{
    
    IMarioState pegarCogumelo();
    IMarioState pegarFlor();
    IMarioState pegarPena();
    IMarioState levarDano();
    
    IEstado subir(Elevador e);
    IEstado descer(Elevador e);
    IEstado parar(Elevador e);
}
