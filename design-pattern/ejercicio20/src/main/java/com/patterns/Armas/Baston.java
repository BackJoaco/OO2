package com.patterns.Armas;

import com.patterns.Armaduras.Armadura;

public class Baston extends Arma {
    @Override
    public int calcularDanioContra(Armadura armadura) {
        return armadura.recibirDanioDe(this);
    }
}
