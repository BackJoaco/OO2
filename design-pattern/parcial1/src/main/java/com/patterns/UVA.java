package com.patterns;

public class UVA extends Prestamo{
    public UVA(double monto, int cuotas, Cliente cliente){
        super(monto, cuotas, cliente);
        
    }

    @Override
    public double calcularInteres() {
        return 3;
    }
    public double calcularCancelacion(){
        return this.calcularRestante2() * 1.10;
    }
}
