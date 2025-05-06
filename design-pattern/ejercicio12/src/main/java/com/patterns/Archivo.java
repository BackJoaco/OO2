package com.patterns;

import java.util.Date;

public class Archivo implements Elemento{
    private String nombre;
    private Date fecha;
    private int bytes;

    public String getNombre() {
        return nombre;
    }
    public Date getFecha() {
        return fecha;
    }
    private int getBytes() {
        return bytes;
    }
    public Archivo(String nombre, Date fecha, int bytes){
        this.nombre = nombre;
        this.fecha = fecha;
        this.bytes = bytes;
    }

    public int calcularTamano(){
        return this.getBytes();
    }

    public Archivo archivoMasGrande(){
        return this;
    }

    public String pwd(){
        return "/" + this.getNombre();
    }
}
