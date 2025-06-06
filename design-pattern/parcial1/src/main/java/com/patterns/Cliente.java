package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private double sueldo;
    private List<Prestamo> prestamos;

    public Cliente(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void solicitarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public boolean soyApto(double cuota){
        return cuota > this.getSueldo() * 0.3;
    }
    
}
