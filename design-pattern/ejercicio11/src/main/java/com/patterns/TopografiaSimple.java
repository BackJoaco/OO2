package com.patterns;

public class TopografiaSimple implements Topografia {
    private Elemento elemento;
    public TopografiaSimple(Elemento elemento) {
        this.elemento = elemento;
    }
    public double calcularProporcion() {
        return elemento.getProporcion();
    }

    public boolean somosIguales(Topografia t) {
        return t.equals(this);
    }
}
