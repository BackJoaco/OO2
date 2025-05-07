package com.patterns;

public class Empleado {
    private Builder builder;

    public Empleado(Builder builder){
        this.builder=builder;
    }

    public void changeBuilder(Builder builder){
        this.builder=builder;
    }
    
    public void hacerClasico(){
        builder.reset();
        builder.ponerPan(new Ingrediente("pan brioche", 100));
        builder.ponerAderezo(new Ingrediente("aderezo a base de mayonesa", 20));
        builder.ponerPrincipal(new Ingrediente("principal de carne de ternera", 300));
        builder.ponerAdicional(new Ingrediente("adicional de tomate", 80));
    }
    public void hacerVegetariano(){
        builder.reset();
        builder.ponerPan(new Ingrediente("pan con semillas", 120));
        builder.ponerPrincipal(new Ingrediente("principal de provoleta grillada", 200));
        builder.ponerAdicional(new Ingrediente("berenjenas al escabeche", 100));
    }
    public void hacerVegano(){
        builder.reset();
        builder.ponerPan(new Ingrediente("pan integral", 100));
        builder.ponerAderezo(new Ingrediente("aderezo de salsa criolla", 20));
        builder.ponerPrincipal(new Ingrediente("principal de milanesa de girgolas", 500));
    }
    public void hacerSinTACC(){
        builder.reset();
        builder.ponerPan(new Ingrediente("pan de chipa", 150));
        builder.ponerAderezo(new Ingrediente("aderezo de salsa tartara", 18));
        builder.ponerPrincipal(new Ingrediente("principal de carne de pollo", 250));
        builder.ponerAdicional(new Ingrediente("adicional de verduras grilladas", 200));
    }
}
