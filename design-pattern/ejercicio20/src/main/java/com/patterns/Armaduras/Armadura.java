package com.patterns.Armaduras;

import com.patterns.Armas.Arco;
import com.patterns.Armas.Baston;
import com.patterns.Armas.Espada;

public abstract class Armadura {
    public abstract int recibirDanioDe(Espada espada);
    public abstract int recibirDanioDe(Arco arco);
    public abstract int recibirDanioDe(Baston baston);
}
