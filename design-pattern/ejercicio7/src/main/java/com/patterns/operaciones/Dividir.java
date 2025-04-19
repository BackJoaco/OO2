package com.patterns.operaciones;

public class Dividir implements Operacion {

    public double operar(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return valor1 / valor2;
    }
}
