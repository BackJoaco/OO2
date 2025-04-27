package com.patterns;

public class Main {
    public static void main(String[] args) {
        // Crear el primer mensajero con el método de encriptado RC4
        Encoder rc4Encoder = new RC4Adapter();
        Mensajero mensajero1 = new Mensajero(rc4Encoder, "claveRC4");

        // Crear el segundo mensajero con el método de encriptado FeistelCipher
        Encoder feistelEncoder = new FeistelCipherAdapter("claveFeistel");
        Mensajero mensajero2 = new Mensajero(feistelEncoder, "claveFeistel");

        // Mensaje a enviar
        String mensaje = "Hola, este es un mensaje secreto.";

        // Mensajero 1 envía el mensaje cifrado con RC4
        System.out.println("Mensajero 1 enviando mensaje con RC4:");
        mensajero1.enviarMensaje(mensaje);

        // Mensajero 2 recibe el mensaje cifrado con RC4
        String mensajeCifradoRC4 = rc4Encoder.cifrar(mensaje, "claveRC4");
        System.out.println("Mensajero 2 recibiendo mensaje con RC4:");
        mensajero2.recibirMensaje(mensajeCifradoRC4);

        // Cambiar el método de encriptado en el primer mensajero a FeistelCipher
        mensajero1.cambiarCifrado(feistelEncoder);

        // Mensajero 1 envía el mensaje cifrado con FeistelCipher
        System.out.println("Mensajero 1 enviando mensaje con FeistelCipher:");
        mensajero1.enviarMensaje(mensaje);

        // Mensajero 2 recibe el mensaje cifrado con FeistelCipher
        String mensajeCifradoFeistel = feistelEncoder.cifrar(mensaje, "claveFeistel");
        System.out.println("Mensajero 2 recibiendo mensaje con FeistelCipher:");
        mensajero2.recibirMensaje(mensajeCifradoFeistel);
    }
}