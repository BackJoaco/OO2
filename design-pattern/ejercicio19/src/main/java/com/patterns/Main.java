package com.patterns;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<Double>();
        temps.add(86.0);
        temps.add(86.0);
        temps.add(86.0);
        temps.add(86.0);
        WeatherData original = new HomeWeatherStation(86, 1008, 200, temps);
        WeatherData auxiliar = original;

        System.out.println("ej 1: " + original.displayData());

        auxiliar = new CelsiusDecorator(auxiliar);
        System.out.println("ej 2: " + auxiliar.displayData());

        auxiliar = new PromedioDecorator(auxiliar);
        System.out.println("ej 3: " + auxiliar.displayData());

        auxiliar=original;
        auxiliar = new PromedioDecorator(auxiliar);
        System.out.println("ej 4: " + auxiliar.displayData());

        
        auxiliar = new MinMaxDecorator(auxiliar);
        auxiliar = new CelsiusDecorator(auxiliar);
        System.out.println("ej 5: " + auxiliar.displayData());

        auxiliar = new CelsiusDecorator(original);
        auxiliar = new MinMaxDecorator(auxiliar);
        System.out.println("ej 6: " + auxiliar.displayData());

        auxiliar = new PromedioDecorator(auxiliar);
        System.out.println("ej 7: " + auxiliar.displayData());

    }
}