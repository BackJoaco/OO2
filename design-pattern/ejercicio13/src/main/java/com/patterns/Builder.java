package com.patterns;

public interface Builder {
    public void reset();
    public void ponerPan(Ingrediente ingrediente);
    public void ponerAderezo(Ingrediente ingrediente);
    public void ponerPrincipal(Ingrediente ingrediente);
    public void ponerAdicional(Ingrediente ingrediente);
    public void ponerNombre(String nombre);
}
