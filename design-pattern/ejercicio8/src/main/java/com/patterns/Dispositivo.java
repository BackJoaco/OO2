package com.patterns;

import com.patterns.calculator.*;
import com.patterns.connection.*;

public class Dispositivo {
    private Ringer ringer;
    private Connection connection;
    private CRC_Calculator crcCalculator;
    private Display display;

    public Dispositivo(Display display, Connection connection, CRC_Calculator crcCalculator) {
        this.ringer = new Ringer();
        this.connection = connection;
        this.crcCalculator = crcCalculator;
        this.display = display;
    }
    public void configurarCRC(CRC_Calculator crcCalculator) {
        this.crcCalculator = crcCalculator;
    }
    public void conectarCon(Connection connection) {
        this.connection = connection;
        display.showBanner(connection.pict());
        ringer.ring();

    }
    public String send(String data){
        long crc = crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

}
