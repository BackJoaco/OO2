package com.patterns.connection;

public class c4GConnection {
    private String symb;
    public c4GConnection(String symb){
        this.symb = symb;
    }
    public String transmit(String data, long crc){
        return "Sending data via 4G: " + data + " with CRC: " + crc;
    }
    public String symb(){
        return this.symb;
    }
}
