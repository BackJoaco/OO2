package com.patterns;

import com.patterns.Armaduras.Armadura;
import com.patterns.Armas.Arma;
import com.patterns.Habilidades.Habilidad;

public class Personaje {
    private String nombre;
    private int vida;
    private Habilidad habilidad;
    private Arma arma;
    private Armadura armadura;

    public Personaje(int vida){ this.vida = vida; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setHabilidad(Habilidad habilidad) { this.habilidad = habilidad; }
    public void setArma(Arma arma) { this.arma = arma; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }

    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(enemigo, arma);
    }

    public void recibirDanio(Personaje enemigo, Arma arma) {
        vida -= arma.calcularDanioContra(armadura);
    }

}
