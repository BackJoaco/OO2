package com.patterns;

import java.util.Date;

public class AutoEnAlquiler {
    private double precioPorDia;
    private String marca;
    private int cantidadPlazas;
    private PoliticaCancelacion politicaCancelacion;

    public AutoEnAlquiler(double precioPorDia, String marca, int cantidadPlazas, PoliticaCancelacion politicaCancelacion) {
        this.precioPorDia = precioPorDia;
        this.marca = marca;
        this.cantidadPlazas = cantidadPlazas;
        this.politicaCancelacion = politicaCancelacion;
    }

    public void setPoliticaCancelacion(PoliticaCancelacion politicaCancelacion) {
        this.politicaCancelacion = politicaCancelacion;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }
    public double calcularMonto(int cantidadDias) {
        return this.precioPorDia * cantidadDias;
    }
    public double calcularReembolso(int cantidadDias, Date fecha) {
        return this.politicaCancelacion.calcularReembolso(this.calcularMonto(cantidadDias), fecha);
    }
}
