package com.patterns;

public class MostrarTamano extends BaseFile{
    public MostrarTamano(File archivo){
        super(archivo);
    }
    public String prettyPrint(){
        return super.prettyPrint() + " " + getTamano();
    }
}
