package com.patterns;

public class RC4Adapter implements Encoder {
    private RC4 rc4;

    public RC4Adapter() {
        this.rc4 = new RC4();
    }

    @Override
    public String cifrar(String mensaje, String clave) {
        return rc4.encriptar(mensaje, clave);
    }

    @Override
    public String descifrar(String mensajeCifrado, String clave) {
        return rc4.desencriptar(mensajeCifrado, clave);
    }

}
