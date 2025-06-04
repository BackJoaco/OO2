package com.patterns;

public class Planta extends Empleado{
    private int anosAntiguedad;
    private boolean casado;
    private int cantHijos;
    public Planta(int a, boolean b, int c){
        this.anosAntiguedad=a;
        this.casado=b;
        this.cantHijos=c;
    }
    public double calcularBasico(){
        return 50000;
    }
    public double calcularAdicional(){
        return 5000 * this.estaCasado() + 2000 * this.getCantHijos() + 2000 * this.getAnosAntiguedad();
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
    public int getAnosAntiguedad(){
        return anosAntiguedad;
    }
}
