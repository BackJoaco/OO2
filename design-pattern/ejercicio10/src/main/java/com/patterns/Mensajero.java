package com.patterns;

public class Mensajero {
    private Encoder encoder;
    private String clave;
    public Mensajero(Encoder encoder, String clave) {
        this.clave = clave;
        this.encoder = encoder;
    }
    public void cambiarCifrado(Encoder encoder) {
        this.encoder = encoder;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void enviarMensaje(String mensaje) {
        String mensajeCifrado = encoder.cifrar(mensaje, this.getClave());
        System.out.println("Enviando mensaje: " + mensajeCifrado);
        // Aquí se enviaría el mensaje cifrado a través de la red
    }
    public void recibirMensaje(String mensaje) {
        String mensajeDescifrado = encoder.descifrar(mensaje, this.getClave());
        System.out.println("Recibiendo mensaje: " + mensajeDescifrado);
    }
}
