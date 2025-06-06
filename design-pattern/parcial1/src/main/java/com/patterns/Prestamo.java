package com.patterns;

public abstract class Prestamo {
    private double monto;
    private int cuotas;
    private double cantPagado;
    private EstadoPrestamo estado;

    public Prestamo(double monto, int cuotas, Cliente cliente){
        this.monto = monto;
        this.cuotas = cuotas;
        this.cantPagado = 0;
        if (cliente.soyApto(this.calcularCuota())){
            this.estado = new Aceptado(this);
        } else{
            this.estado = new Rechazado(this);
        } 
    }
    public double calcularCuota(){
        return (this.monto / this.cuotas) * this.calcularInteres();
    }
    public abstract double calcularInteres();

    public void setEstado(EstadoPrestamo estado){
        this.estado = estado;
    }
    public void descontarCuota(){
        this.cuotas--;
        this.cantPagado += this.calcularCuota();
        if (this.cuotas == 0){
            this.estado = new Finalizado(this);
        }
    }
    public void pagarCuota(){
        this.estado.pagarCuota();
    }
    public double getCantPagado(){
        return this.cantPagado;
    }

    public double calcularRestante2(){
        return this.calcularCuota() *cuotas;
    }
    public double calcularRestante(){
        return this.estado.calcularRestante();
    }

    public abstract double calcularCancelacion();
    public void cancelarPrestamo(){
        this.estado.cancelarPrestamo();
    }

}
