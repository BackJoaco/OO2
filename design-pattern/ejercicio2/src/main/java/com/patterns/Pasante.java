package com.patterns;

public class Pasante extends Empleado{
    private int cantExamenesRendidos;

    public Pasante(int c){
        this.cantExamenesRendidos = c;
    }
    
    public double calcularBasico(){
        return 20000;
    }
    public double calcularAdicional(){
        return 2000 * this.cantExamenesRendidos;
    }
}
