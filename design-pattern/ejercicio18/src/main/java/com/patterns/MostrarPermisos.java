package com.patterns;

public class MostrarPermisos extends BaseFile{
    public MostrarPermisos(File archivo){
        super(archivo);
    }
    public String prettyPrint(){
        return super.prettyPrint() + " " + getPermisos();
    }
}
