package com.mycompany.criandoelevador;

public class CriandoElevador {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        
        elevador.descer(elevador);
        elevador.subir(elevador);
        elevador.parar(elevador);
    }
}
