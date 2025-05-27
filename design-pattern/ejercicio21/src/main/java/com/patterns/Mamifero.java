package com.patterns;

import java.util.Date;

public class Mamifero implements MamiferoInterface{
    private String identificador;
    private String especie;
    private Date fechaNacimiento;
    private MamiferoInterface padre;
    private MamiferoInterface madre;
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public MamiferoInterface getPadre() {
        return padre;
    }
    public void setPadre(MamiferoInterface padre) {
        this.padre = padre;
    }
    public MamiferoInterface getMadre() {
        return madre;
    }
    public void setMadre(MamiferoInterface madre) {
        this.madre = madre;
    }
    
    public MamiferoInterface getAbueloMaterno(){
        return this.madre.getPadre();
    }
    public MamiferoInterface getAbueloPaterno(){
        return this.padre.getPadre();
    }
    public MamiferoInterface getAbuelaMaterna(){
        return this.madre.getMadre();
    }
    public MamiferoInterface getAbuelaPaterna(){
        return this.padre.getPadre();
    }
    public boolean tieneComoAncestroA(MamiferoInterface mamifero) {
        return ((this.padre == mamifero) || this.padre.tieneComoAncestroA(mamifero)) || 
           ((this.madre == mamifero) || this.madre.tieneComoAncestroA(mamifero));
    }
    
}
