package com.patterns;

import java.time.LocalDate;

public abstract class BaseFile implements File{
    protected File archivo;

    public BaseFile(File a){
        this.archivo = a;
    }

    public String getNombre() {
        return archivo.getNombre();
    }
    public String getExtension() {
        return archivo.getExtension();
    }
    public double getTamano() {
        return archivo.getTamano();
    }
    public LocalDate getFecha_creacion() {
        return archivo.getFecha_creacion();
    }
    public LocalDate getFecha_mod() {
        return archivo.getFecha_mod();
    }
    public String getPermisos() {
        return archivo.getPermisos();
    }

    public String prettyPrint(){
        return archivo.prettyPrint();
    }
}
