package com.patterns;

public class MostrarFechaModificacion extends BaseFile{
    public MostrarFechaModificacion(File archivo){
        super(archivo);
    }
    public String prettyPrint(){
        return super.prettyPrint() + " " + getFecha_mod();
    }
}
