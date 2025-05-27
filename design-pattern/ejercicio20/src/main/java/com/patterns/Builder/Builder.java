package com.patterns.Builder;

import com.patterns.Personaje;
import com.patterns.Armaduras.Armadura;
import com.patterns.Armas.Arma;
import com.patterns.Habilidades.Habilidad;

public interface Builder {
    void reset();
    void setNombre(String nombre);
    void setHabilidad(Habilidad habilidad);
    void setArma(Arma arma);
    void setArmadura(Armadura armadura);
    Personaje getResult();
}
