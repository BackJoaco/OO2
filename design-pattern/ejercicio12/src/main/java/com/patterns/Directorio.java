package com.patterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio implements Elemento{
    private List<Elemento> contenido;
    private String nombre;
    private Date fechaCreacion;

    public String getNombre() {
        return nombre;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Directorio(String nombre, Date fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        contenido = new ArrayList<Elemento>();
    }

    public void agregarElementos(Elemento elemento){
        contenido.add(elemento);
    }

    public void quitarElemento(Elemento elemento){
        contenido.remove(elemento);
    }

    public int calcularTamano(){
        return 32000 + this.contenido.stream().mapToInt(elem -> elem.calcularTamano()).sum();
    }

    public Archivo archivoMasGrande(){
        /**return contenido.stream()
            .max((a, b) -> Integer.compare(
                a.calcularTamano(), b.calcularTamano()))
            .orElse(null);*/
        return null;
    }

    public Elemento buscar(String nombre){
        return contenido.stream()
            .filter(e -> e.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    public List<Elemento> buscarTodos(String nombre){
        return contenido.stream()
            .filter(e -> e.getNombre().equals(nombre))
            .collect(Collectors.toList());
    }
    
    public String pwd(){
        String resultado = "/" + this.getNombre();
        for (Elemento elem : contenido) {
            resultado += "\n" + elem.pwd();
        }
        return resultado;
    }
}
