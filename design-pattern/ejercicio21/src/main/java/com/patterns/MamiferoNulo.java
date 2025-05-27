package com.patterns;

import java.util.Date;

public class MamiferoNulo implements MamiferoInterface{
    public String getIdentificador() {
        return "N/A";
    }
    public void setIdentificador(String identificador) {}
    public String getEspecie() {
        return "N/A";
    }
    public void setEspecie(String especie) {}
    public Date getFechaNacimiento() {
        return new Date(0);
    }
    public void setFechaNacimiento(Date fechaNacimiento) {}
    public MamiferoInterface getPadre() {
        return this;
    }
    public void setPadre(MamiferoInterface padre) {}
    public MamiferoInterface getMadre() {
        return this;
    }
    public void setMadre(MamiferoInterface madre) {}
    
    public MamiferoInterface getAbueloMaterno(){
        return this;
    }
    public MamiferoInterface getAbueloPaterno(){
        return this;
    }
    public MamiferoInterface getAbuelaMaterna(){
        return this;
    }
    public MamiferoInterface getAbuelaPaterna(){
        return this;
    }
    public boolean tieneComoAncestroA(MamiferoInterface mamifero) {
        return false;
    }
}
