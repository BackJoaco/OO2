package com.patterns.Builder;

public abstract class Director {
    protected Builder builder;

    public Director(Builder b) { this.builder = b; }

    public void changeBuilder(Builder b) { this.builder = b; }

    public abstract void crearPersonaje();
}
