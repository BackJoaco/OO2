package com.patterns;

public class MostrarExtension extends BaseFile{
    public MostrarExtension (File archivo){
        super(archivo);
    }
    public String prettyPrint(){
        return super.prettyPrint() +" "+ getExtension();
    }
}
