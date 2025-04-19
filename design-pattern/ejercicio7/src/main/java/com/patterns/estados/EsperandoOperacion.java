package com.patterns.estados;

import com.patterns.Calculadora;

public class EsperandoOperacion implements Estados {
    private Calculadora contexto;

    public String getResultado(){
        return contexto.imprimirResultado();
    }

    public void setValor(double unValor){
        contexto.setEstado(new Error());
    }

    public void mas(){
        // Indica que la calculadora debe esperar un nuevo valor
        contexto.setEstado(new EsperandoValor());
        contexto.sumar();
    }
    public void menos(){
        contexto.setEstado(new EsperandoValor());
        contexto.restar();
    }
    public void por(){
        contexto.setEstado(new EsperandoValor());
        contexto.multiplicar();
    }
    public void dividido(){
        contexto.setEstado(new EsperandoValor());
        contexto.dividir();
    }
}
