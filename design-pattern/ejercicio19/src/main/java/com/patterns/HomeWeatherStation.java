package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturas;

    public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, ArrayList<Double> temperaturas){
        this.temperatura = temperatura;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
        this.temperaturas = new ArrayList<Double>();
        this.temperaturas = temperaturas;
    }

    

    public double getTemperatura() {
        return temperatura;
    }



    public double getPresion() {
        return presion;
    }



    public double getRadiacionSolar() {
        return radiacionSolar;
    }



    public List<Double> getTemperaturas() {
        return temperaturas;
    }



    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() + 
            " Presion atmosf: " + this.getPresion() +
            " Presion solar: " + this.getRadiacionSolar();
    }
    
}
