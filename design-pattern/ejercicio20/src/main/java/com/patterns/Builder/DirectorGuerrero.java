package com.patterns.Builder;

import com.patterns.Armaduras.Hierro;
import com.patterns.Armas.Espada;
import com.patterns.Habilidades.Melee;

public class DirectorGuerrero extends Director {
    public DirectorGuerrero(Builder b) { super(b); }

    @Override
    public void crearPersonaje() {
        builder.reset();
        builder.setNombre("Guerrero");
        builder.setHabilidad(new Melee());
        builder.setArma(new Espada());
        builder.setArmadura(new Hierro());
    }
}
