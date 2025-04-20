package com.patterns;

import java.util.Date;

public class CancelacionModerada implements PoliticaCancelacion {

    public double calcularReembolso(double monto, Date fecha) {
        // Se reembolsará el monto total si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes.
        if (fecha.getTime() > System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000) {
            return monto; // 100% de reembolso si se cancela más de una semana antes
        } else if (fecha.getTime() > System.currentTimeMillis() + 2 * 24 * 60 * 60 * 1000) {
            return monto / 2; // 50% de reembolso si se cancela entre una semana y dos días antes
        } else {
            return 0; // Sin reembolso si se cancela menos de dos días antes
        }
    }

}
