package com.patterns;

public interface Encoder {
    public String cifrar(String mensaje, String clave);
    public String descifrar(String mensaje, String clave);
}
