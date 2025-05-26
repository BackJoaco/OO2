package com.patterns;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        File OO2 = new FileOO2("arch1", "txt", 20, LocalDate.now(), LocalDate.now(), "administrador");

        System.out.println(OO2.prettyPrint());

        OO2 = new MostrarExtension(OO2);
        OO2 = new MostrarFechaCreacion(OO2);

        System.out.println(OO2.prettyPrint());
    }
}