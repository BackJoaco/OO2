package com.patterns;

public class Simple extends Prestamo{
    private double interes;
    public Simple(double monto, int cuotas, Cliente cliente, double interes){
        super(monto, cuotas, cliente);
        this.interes = interes;
    }
    public double calcularInteres(){
        return this.interes;
    }
    public double calcularCancelacion(){
        return this.calcularRestante2() * 1.10 + 5000;
    }
}
