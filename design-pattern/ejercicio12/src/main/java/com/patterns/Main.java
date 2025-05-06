package com.patterns;

import java.util.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //construir el filesystem y probar solo el metodo listado de contenido
        Elemento raiz = new Directorio("Raiz", new LocalDate().now()); 
        FileSystem fs = new FileSystem();
    }
}