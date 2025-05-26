package com.patterns;

import java.time.LocalDate;

public class FileOO2 implements File{
    private String nombre;
    private String extension;
    private double tamano;
    private LocalDate fecha_creacion;
    private LocalDate fecha_mod;
    private String permisos;
    
    public FileOO2(String nombre, String extension, double tamano, LocalDate fecha_creacion, LocalDate fecha_mod,
            String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamano = tamano;
        this.fecha_creacion = fecha_creacion;
        this.fecha_mod = fecha_mod;
        this.permisos = permisos;
    }
    public String getNombre() {
        return nombre;
    }
    public String getExtension() {
        return extension;
    }
    public double getTamano() {
        return tamano;
    }
    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }
    public LocalDate getFecha_mod() {
        return fecha_mod;
    }
    public String getPermisos() {
        return permisos;
    }

    public String prettyPrint(){
        return this.getNombre();
    }
}
