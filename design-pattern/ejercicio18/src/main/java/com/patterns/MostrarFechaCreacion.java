package com.patterns;

public class MostrarFechaCreacion extends BaseFile{
    public MostrarFechaCreacion(File archivo){
        super(archivo);
    }
    public String prettyPrint(){
        return super.prettyPrint() + " " + getFecha_creacion();
    }
}
