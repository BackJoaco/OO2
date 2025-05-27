package com.patterns;

import java.util.List;

public abstract class WeatherDataDecorator implements WeatherData{
    protected WeatherData weatherData;

    public WeatherDataDecorator(WeatherData weatherData){
        this.weatherData = weatherData;
    }
    public double getTemperatura() {
        return weatherData.getTemperatura();
    }
    public double getPresion() {
        return weatherData.getPresion();
    }
    public double getRadiacionSolar() {
        return weatherData.getRadiacionSolar();
    }
    public List<Double> getTemperaturas() {
        return weatherData.getTemperaturas();
    }
    @Override
    public String displayData() {
        return weatherData.displayData();
    }
}
