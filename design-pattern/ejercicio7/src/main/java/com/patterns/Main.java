package com.patterns;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); 
        calc.setValor(5); // Establece el valor inicial 
        calc.mas(); // Prepara para sumar 
        calc.setValor(3); // Suma 3 al valor acumulado 
        System.out.println(calc.getResultado()); // Imprimirá "8.0"
        calc.por();
        calc.setValor(2);
        System.out.println(calc.getResultado()); // Imprimirá "16.0"
    }
}