package com.patterns;

import java.util.Date;

public class Reserva {
    private Usuario conductor;
    private AutoEnAlquiler auto;
    private int cantidadDias;
    private Date fecha;
    public Reserva(AutoEnAlquiler auto, Usuario conductor, int cantidadDias, Date fecha) {
        this.conductor = conductor;
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.auto = auto;
    }
    public Usuario getConductor() {
        return conductor;
    }
    public int getCantidadDias() {
        return cantidadDias;
    }
    public Date getFecha() {
        return fecha;
    }
    public AutoEnAlquiler getAuto() {
        return auto;
    }
    public double montoAPagar(){
        return this.auto.calcularMonto(cantidadDias);
    }
    public double montoAReembolsar(){
        return this.auto.calcularReembolso(cantidadDias, fecha);
    }
}
