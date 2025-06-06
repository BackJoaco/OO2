package com.patterns;

public class Rechazado implements EstadoPrestamo{
    private Prestamo prestamo;
    public Rechazado(Prestamo prestamo){
        this.prestamo = prestamo;
    }

    public void pagarCuota(){
        throw new Error("Error");
    }
    public double calcularRestante(){
        throw new Error("Error");
    }
    public double cancelarPrestamo(){
        throw new Error("Error");
    }
}
