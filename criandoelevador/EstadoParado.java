package com.mycompany.criandoelevador;


public class EstadoParado implements IEstado {
    
    public IEstado parar(Elevador e){
        System.out.println("Parando elevador");
        return this;
    }
    public IEstado descer(Elevador e){               
         e.desAndar();
        return new EstadoDescendo();
    }
    public IEstado subir(Elevador e){
       e.incAndar();
       return new EstadoSubindo();
    }
}
