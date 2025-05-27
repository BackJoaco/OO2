package com.patterns;

import java.util.List;
import java.util.OptionalDouble;

public class PromedioDecorator extends WeatherDataDecorator{

    public PromedioDecorator(WeatherData weatherData) {
        super(weatherData);
        //TODO Auto-generated constructor stub
    }

    private double getPromedio(){
        List<Double> temperaturas = getTemperaturas();
        OptionalDouble promedio = temperaturas.stream()
            .mapToDouble(Double::doubleValue)
            .average();
        if (promedio.isPresent()) {
            return promedio.getAsDouble();
        } else {
            return 0.0; // or throw an exception if you prefer
        }
    }

    public String displayData(){
        return super.displayData() + " Promedio: " + getPromedio(); 
    }
}
