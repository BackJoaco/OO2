package com.patterns.Builder;

import com.patterns.Armaduras.Acero;
import com.patterns.Armas.Baston;
import com.patterns.Habilidades.Magia;

public class DirectorMago extends Director {
    public DirectorMago(Builder b) { super(b); }

    @Override
    public void crearPersonaje() {
        builder.reset();
        builder.setNombre("Mago");
        builder.setHabilidad(new Magia());
        builder.setArma(new Baston());
        builder.setArmadura(new Acero());
    }
}
