package com.patterns;

import java.util.HashMap;
import java.util.Map;

public class Sanguche {
    private Map<String ,Ingrediente> ingredientes;
    private String nombre;

    public Sanguche(){
        this.ingredientes = new HashMap<>();
    }

    public Ingrediente getPan(){
        return this.ingredientes.get("pan");
    }
    public void setPan(Ingrediente pan){
        this.ingredientes.put("pan", pan);
    }
    public Ingrediente getAderezo(){
        return this.ingredientes.get("aderezo");
    }
    public void setAderezo(Ingrediente aderezo){
        this.ingredientes.put("aderezo", aderezo);
    }
    public Ingrediente getPrincipal(){
        return this.ingredientes.get("principal");
    }
    public void setPrincipal(Ingrediente principal){
        this.ingredientes.put("principal", principal);
    }
    public Ingrediente getAdicional(){
        return this.ingredientes.get("adicional");
    }
    public void setAdicional(Ingrediente adicional){
        this.ingredientes.put("adicional", adicional);
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return this.ingredientes.values().stream()
            .mapToDouble(a -> a.getPrecio())
            .sum();
    }
}   
