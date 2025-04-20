package com.patterns;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.autosEnAlquiler = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void alquilarAuto(AutoEnAlquiler auto) {
        autosEnAlquiler.add(auto);
    }
}
