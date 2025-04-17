package com.patterns;

public class EstadoDefinitiva implements EstadoExcursion {

    public void inscribir(Excursion excursion,Usuario unUsuario) {
        excursion.inscribirUsuario(unUsuario);
        if (excursion.getCantInscriptos() < excursion.getCupoMaximo()) {
            excursion.setState(new EstadoCompleta());
        }
    }
    public String obtenerInformacion(Excursion excursion) {
        return String.format(
            "Nombre: %s, Costo: %.2f, Fechas: %s, Punto de encuentro: %s, Usuarios faltantes para el cupo mínimo: %d",
            excursion.getNombre(),
            excursion.getCosto(),
            excursion.getFechaInicio(),
            excursion.getFechaFin(),
            excursion.getPuntoDeEncuentro(),
            excursion.getMails().toString(),
            excursion.getCupoMaximo() - excursion.getCantInscriptos()
        );
    }

}
