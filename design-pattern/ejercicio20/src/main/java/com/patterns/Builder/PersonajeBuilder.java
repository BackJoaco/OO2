package com.patterns.Builder;

import com.patterns.Personaje;
import com.patterns.Armaduras.Armadura;
import com.patterns.Armas.Arma;
import com.patterns.Habilidades.Habilidad;

public class PersonajeBuilder implements Builder {
    private Personaje personaje;

    public PersonajeBuilder() { reset(); }

    @Override
    public void reset() { personaje = new Personaje(100); }

    @Override
    public void setNombre(String nombre) { personaje.setNombre(nombre); }

    @Override
    public void setHabilidad(Habilidad habilidad) { personaje.setHabilidad(habilidad); }

    @Override
    public void setArma(Arma arma) { personaje.setArma(arma); }

    @Override
    public void setArmadura(Armadura armadura) { personaje.setArmadura(armadura); }

    @Override
    public Personaje getResult() { return personaje; }
}
