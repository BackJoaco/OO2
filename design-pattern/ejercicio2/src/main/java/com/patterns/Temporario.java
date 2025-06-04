package com.patterns;

public class Temporario extends Empleado{
    private int horasTrabajadas;
    private boolean casado;
    private int cantHijos;
    public Temporario(int a, boolean b, int c){
        this.horasTrabajadas=a;
        this.casado=b;
        this.cantHijos=c;
    }
    public double calcularBasico(){
        return this.getBasico() + 300 * horasTrabajadas;
    }
    public int estaCasado(){
        if (casado){
            return 1;
        }
        return 0;
    }
    public int getCantHijos(){
        return cantHijos;
    }
    public double calcularAdicional(){
        return 5000 * estaCasado() + 2000 * getCantHijos();
    }
}
