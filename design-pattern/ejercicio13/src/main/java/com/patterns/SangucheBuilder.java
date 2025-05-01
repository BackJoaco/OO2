package com.patterns;

public class SangucheBuilder implements Builder{
    private Sanguche sanguche;

    public void reset(){
        this.sanguche = new Sanguche();
    }
    public void ponerPan(Ingrediente ingrediente){
        this.sanguche.setPan(ingrediente);
    }
    public void ponerAderezo(Ingrediente ingrediente){
        this.sanguche.setAderezo(ingrediente);
    }
    public void ponerPrincipal(Ingrediente ingrediente){
        this.sanguche.setPrincipal(ingrediente);
    }
    public void ponerAdicional(Ingrediente ingrediente){
        this.sanguche.setAdicional(ingrediente);
    }
    public void ponerNombre(String nombre){
        this.sanguche.setNombre(nombre);
    }
}
