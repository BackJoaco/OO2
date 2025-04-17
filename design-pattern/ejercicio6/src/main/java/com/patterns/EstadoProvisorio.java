package com.patterns;

public class EstadoProvisorio implements EstadoExcursion {

    public void inscribir(Excursion excursion,Usuario unUsuario) {
        excursion.inscribirUsuario(unUsuario);
        if (excursion.getCantInscriptos() >= excursion.getCupoMinimo()) {
            excursion.setState(new EstadoDefinitiva());
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
            excursion.getCupoMinimo() - excursion.getCantInscriptos()
        );
    }

}
