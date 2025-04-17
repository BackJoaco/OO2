package com.patterns;

public interface EstadoExcursion {
    void inscribir(Excursion excursion,Usuario unUsuario);

    String obtenerInformacion(Excursion excursion);
}
