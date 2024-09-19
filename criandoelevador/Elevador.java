
package com.mycompany.criandoelevador;


public class Elevador {
    private int andar;
    private IEstado estado;
    
    public Elevador(){
        estado = new EstadoParado();
    }
    
    public void desAndar(){
        andar--;
        System.out.println("Elevador descendo");
    }
    public void incAndar(){
        andar++;
        System.out.println("Elevador subindo");
    }
    public void subir (Elevador e){
         estado = estado.subir(this);
     }    
     public void parar(Elevador e){
         estado = estado.parar(this);
     }
     public void descer (Elevador e){
         estado = estado.descer(this);
     }

}
