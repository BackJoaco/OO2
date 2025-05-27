package com.patterns;

import com.patterns.Builder.Builder;
import com.patterns.Builder.Director;
import com.patterns.Builder.DirectorArquero;
import com.patterns.Builder.DirectorGuerrero;
import com.patterns.Builder.DirectorMago;
import com.patterns.Builder.PersonajeBuilder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new PersonajeBuilder();

        Director directorGuerrero = new DirectorGuerrero(builder);
        directorGuerrero.crearPersonaje();
        System.out.println(builder.getResult());

        Director directorArquero = new DirectorArquero(builder);
        directorArquero.crearPersonaje();
        System.out.println(builder.getResult());

        Director directorMago = new DirectorMago(builder);
        directorMago.crearPersonaje();
        System.out.println(builder.getResult());
    }
}