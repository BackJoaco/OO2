package com.patterns;

import java.util.Date;

public class CancelacionFlexible implements PoliticaCancelacion {
 
    public double calcularReembolso(double monto, Date fecha) {
        if (fecha.getTime() > System.currentTimeMillis()) {
            return monto; // 100% de reembolso si se cancela antes de la fecha
        } else {
            return 0; // Sin reembolso si se cancela después de la fecha
        }
    }

}
