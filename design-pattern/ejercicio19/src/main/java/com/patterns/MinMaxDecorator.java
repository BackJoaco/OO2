package com.patterns;

import java.util.List;
import java.util.Optional;

public class MinMaxDecorator extends WeatherDataDecorator{

    public MinMaxDecorator(WeatherData weatherData) {
        super(weatherData);
        //TODO Auto-generated constructor stub
    }

    private double getMax(){
        List<Double> temperaturas = getTemperaturas();
        Optional<Double> maxTemp = temperaturas.stream().max(Double::compare);
        if (maxTemp.isPresent()) {
            return maxTemp.get();
        } else {
            return 0.0; // or throw an exception if you prefer
        }
    }
    private double getMin(){
        List<Double> temperaturas = getTemperaturas();
        Optional<Double> minTemp = temperaturas.stream().min(Double::compare);
        if (minTemp.isPresent()) {
            return minTemp.get();
        } else {
            return 0.0; // or throw an exception if you prefer
        }
    }
    
    public String displayData(){
        return super.displayData() + " Minimo: " + getMin() + " Maximo: " + getMax();
    }
}
