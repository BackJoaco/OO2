package com.patterns;

public class FeistelCipherAdapter implements Encoder {
    private FeistelCipher feistelCipher;

    public FeistelCipherAdapter(String key) {
        this.feistelCipher = new FeistelCipher(key);
    }

    public String cifrar(String mensaje, String clave) {
        return feistelCipher.encode(mensaje);
    }

    public String descifrar(String mensajeCifrado, String clave) {
        return feistelCipher.encode(mensajeCifrado);
    }
}
