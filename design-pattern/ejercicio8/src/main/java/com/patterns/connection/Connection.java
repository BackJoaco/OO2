package com.patterns.connection;

public interface Connection {
    public String sendData(String data, long crc);
    public String pict();
}
