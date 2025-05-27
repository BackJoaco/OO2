package com.patterns;

import java.util.Date;

public interface MamiferoInterface {
    public String getIdentificador();
    public void setIdentificador(String id);
    public String getEspecie();
    public void setEspecie(String e);
    public Date getFechaNacimiento();
    public void setFechaNacimiento(Date fecha);
    public MamiferoInterface getPadre();
    public void setPadre(MamiferoInterface mamifero);
    public MamiferoInterface getMadre();
    public void setMadre(MamiferoInterface mamifero);
    public MamiferoInterface getAbueloMaterno();
    public MamiferoInterface getAbuelaMaterna();
    public MamiferoInterface getAbueloPaterno();
    public MamiferoInterface getAbuelaPaterna();
    public boolean tieneComoAncestroA(MamiferoInterface mamifero);
}
