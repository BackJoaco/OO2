package com.patterns;

public class CelsiusDecorator extends WeatherDataDecorator{

    public CelsiusDecorator(WeatherData weatherData) {
        super(weatherData);
        //TODO Auto-generated constructor stub
    }
    public double getTemperatura(){
        return (super.getTemperatura() - 32)/ 1.8;
    }

    public String displayData(){
        return "Temperatura C: " + this.getTemperatura() + 
            " Presion atmosf: " + this.getPresion() +
            " Presion solar: " + this.getRadiacionSolar();
    }
    
}
