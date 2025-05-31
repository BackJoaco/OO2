package com.patterns.Armaduras;

import com.patterns.Armas.Arco;
import com.patterns.Armas.Baston;
import com.patterns.Armas.Espada;

public class Hierro extends Armadura {
    @Override
    public int recibirDanioDe(Espada espada) {
        return 5;
    }

    @Override
    public int recibirDanioDe(Arco arco) {
        return 3;
    }

    @Override
    public int recibirDanioDe(Baston baston) {
        return 1;
    }
}
