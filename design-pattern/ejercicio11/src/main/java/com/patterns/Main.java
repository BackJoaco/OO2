package com.patterns;

public class Main {
    public static void main(String[] args) {
        Topografia topografia1;
        Topografia topografia2;
        topografia1 = new TopografiaMixta(new TopografiaSimple(new Agua()), new TopografiaSimple(new Agua()),
                new TopografiaSimple(new Tierra()), new TopografiaSimple(new Tierra()));
        topografia2 = new TopografiaMixta(new TopografiaSimple(new Agua()), new TopografiaSimple(new Tierra()),
                new TopografiaSimple(new Tierra()), topografia1);

        System.out.println("Proporcion de la primera topografía mixta: " + topografia1.calcularProporcion());
        System.out.println("Proporcion de la segunda topografía mixta: " + topografia2.calcularProporcion());
        System.out.println("¿Son iguales? " + topografia1.somosIguales(topografia2));
        System.out.println("¿Son iguales? " + new TopografiaSimple(new Agua()).somosIguales(new TopografiaSimple(new Tierra())));
        System.out.println("¿Son iguales? " + topografia2.somosIguales(topografia2));
    }
}
