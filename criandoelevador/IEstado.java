
package com.mycompany.criandoelevador;

public interface IEstado {
    IEstado subir(Elevador e);
    IEstado descer(Elevador e);
    IEstado parar(Elevador e);
}
