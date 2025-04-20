package com.patterns.connection;

public class c4GAdapter implements Connection {
    private c4GConnection c4GConnection;

    public c4GAdapter(c4GConnection c4GConnection) {
        this.c4GConnection = c4GConnection;
    }
    public String pict() {
        return c4GConnection.symb();
    }

    @Override
    public String sendData(String data, long crc) {
        return c4GConnection.transmit(data, crc);
    }
}
