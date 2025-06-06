package com.patterns;

public class Aceptado implements EstadoPrestamo{
    private Prestamo prestamo;
    public Aceptado(Prestamo prestamo){
        this.prestamo = prestamo;
    }
  
    public void pagarCuota(){
        prestamo.descontarCuota();
    }
    public double calcularRestante(){
        return prestamo.calcularRestante2();
    }

    public double cancelarPrestamo(){
        return this.prestamo.calcularCancelacion();
    }
}
