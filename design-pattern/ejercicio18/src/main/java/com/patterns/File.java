package com.patterns;

import java.time.LocalDate;

public interface File {
    public String prettyPrint();
    public String getNombre();
    public String getExtension();
    public double getTamano();
    public LocalDate getFecha_creacion();
    public LocalDate getFecha_mod();
    public String getPermisos();
}
