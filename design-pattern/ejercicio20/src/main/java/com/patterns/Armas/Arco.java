package com.patterns.Armas;

import com.patterns.Armaduras.Armadura;

public class Arco extends Arma {
    @Override
    public int calcularDanioContra(Armadura armadura) {
        return armadura.recibirDanioDe(this);
    }
}
