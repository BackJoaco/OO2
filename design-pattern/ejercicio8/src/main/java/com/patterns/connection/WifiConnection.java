package com.patterns.connection;

public class WifiConnection implements Connection {
    public String sendData(String data, long crc){
        return "Sending data via Wifi: " + data + " with CRC: " + crc;
    }
    public String pict(){
        return "Wifi pict";
    }
}
