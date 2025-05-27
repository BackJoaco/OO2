package com.patterns.Builder;

import com.patterns.Armaduras.Cuero;
import com.patterns.Armas.Arco;
import com.patterns.Habilidades.Distancia;

public class DirectorArquero extends Director {
    public DirectorArquero(Builder b) { super(b); }

    @Override
    public void crearPersonaje() {
        builder.reset();
        builder.setNombre("Arquero");
        builder.setHabilidad(new Distancia());
        builder.setArma(new Arco());
        builder.setArmadura(new Cuero());
    }
}
