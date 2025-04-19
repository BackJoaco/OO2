package com.patterns;
import com.patterns.estados.*;
import com.patterns.estados.Error;
import com.patterns.operaciones.*;

public class Calculadora {
    private Estados estado;
    private double valorAcumulado;
    private Operacion operacion;

    public Calculadora() {
        this.estado = new EsperandoOperacion();
        this.valorAcumulado = 0;
        this.operacion = new Sumar();
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    /**
 	* Devuelve el resultado actual de la operación realizada.
* Si no se ha realizado ninguna operación, devuelve el valor acumulado.
* Si la calculadora se encuentra en error, devuelve “error”
     */
    public String getResultado() {
        return estado.getResultado();
    }
    public double getValorAcumulado() {
        return valorAcumulado;
    }
    public String imprimirResultado(){
        return String.valueOf(valorAcumulado);
    }

    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
        this.valorAcumulado = 0;
        this.estado = new EsperandoValor();
    }


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
        estado.setValor(unValor);
    }
    public void calcular(double unValor) {
        this.valorAcumulado = operacion.operar(valorAcumulado, unValor);
    }

     /**
      * Indica que la calculadora debe esperar un nuevo valor. 
      * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
      * el valor recibido como parámetro, al valor actual y guardará el resultado 
      */
    
    public void mas() {
        this.estado.mas();
    }
    public void menos() {
        this.estado.menos();
    }
    public void por() {
        this.estado.por();
    }
    public void dividido() {
        this.estado.dividido();
    }
    public void sumar() {
        this.operacion = new Sumar();
    }
    public void restar() {
        this.operacion = new Restar();
    }
    public void multiplicar() {
        this.operacion = new Multiplicar();
    }
    public void dividir() {
        if (valorAcumulado == 0) {
            this.setEstado(new Error());
        }
        this.operacion = new Dividir();
    }
}
