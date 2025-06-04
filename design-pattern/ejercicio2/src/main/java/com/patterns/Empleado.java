package com.patterns;

public abstract class Empleado {
    private double basico;
    private double adicional;
    private double descuento;
    public double sueldo(){
        return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuentos();
    }
    public abstract double calcularAdicional();
    public abstract double calcularBasico();
    public double getBasico() {
        return basico;
    }
    public double getAdicional() {
        return adicional;
    }
    public double getDescuento() {
        return descuento;
    }
    public double calcularDescuentos(){
        return this.calcularBasico() * 0.13 + this.calcularAdicional() * 0.05;
    }

}
