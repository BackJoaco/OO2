package com.patterns;

public class EstadoCompleta implements EstadoExcursion {

    public void inscribir(Excursion excursion, Usuario unUsuario) {
        excursion.inscribirUsuarioEnListaEspera(unUsuario);
    }

    public String obtenerInformacion(Excursion excursion) {
        return String.format(
            "Nombre: %s, Costo: %.2f, Fechas: %s, Punto de encuentro: %s, Usuarios faltantes para el cupo mínimo: %d",
            excursion.getNombre(),
            excursion.getCosto(),
            excursion.getFechaInicio(),
            excursion.getFechaFin(),
            excursion.getPuntoDeEncuentro()
        );
    }

}
