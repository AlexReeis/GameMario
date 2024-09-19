package com.mycompany.gamemario;

import com.mycompany.criandoelevador.Elevador;

public class Mario {
    protected IMarioState estado;
    protected Elevador elevador;
    protected int pontos;
    
    public Mario(){
        estado = new MarioPequeno(this);
        this.pontos = 0;       
        elevador = new Elevador();
    }
    public void ganharPontos(int valor){
        this.pontos += valor;
        verificarSeMarioMorreu();
        System.out.println("Pontos: " + this.pontos + "\n");
    }
    public void perderPontos(int valor){
        this.pontos -= valor;
        verificarSeMarioMorreu();
        System.out.println("Pontos: " + this.pontos + "\n");
    }
    private void verificarSeMarioMorreu() {
        if (this.pontos < 0) {
            System.out.println("Mario ficou sem pontos e morreu! Reiniciando o jogo...");
            this.pontos = 0;
            this.estado = new MarioPequeno(this);
        }
    }
    public int getPontos(){
        return pontos;
    }
    public void pegarCogumelo(){
        estado = estado.pegarCogumelo();
    }
    public void pegarFlor(){
        estado = estado.pegarFlor();
    }
    public void pegarPena(){
        estado = estado.pegarPena();
    }
    public void levarDano(){        
        estado = estado.levarDano();
    }
    public void subir() {
        estado.subir(elevador);
    }
    public void descer() {
        estado.descer(elevador);
    }
    public void parar() {
        estado.parar(elevador);
    }
    
}
