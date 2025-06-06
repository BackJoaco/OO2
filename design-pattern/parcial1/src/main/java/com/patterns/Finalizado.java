package com.patterns;

public class Finalizado implements EstadoPrestamo{
    private Prestamo prestamo;
    public Finalizado(Prestamo prestamo){
        this.prestamo = prestamo;
    }

    public void pagarCuota(){
        throw new Error("Error");
    }
    public double calcularRestante(){
        throw new Error("Error");
    }
    public double cancelarPrestamo(){
        return 0;
    }
}
