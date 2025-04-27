package com.patterns;

public class Pantano implements Elemento, Topografia{
    private double proporcion;
    public Pantano(){
        this.proporcion = 0.7;
    }
    public double calcularProporcion() {
        return elemento.getProporcion();
    }

    public boolean somosIguales(Topografia t) {
        return t.equals(this);
    }
}
