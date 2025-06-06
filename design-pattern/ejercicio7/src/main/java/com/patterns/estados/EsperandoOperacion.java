package com.patterns.estados;

import com.patterns.Calculadora;
import com.patterns.operaciones.Dividir;
import com.patterns.operaciones.Multiplicar;
import com.patterns.operaciones.Restar;
import com.patterns.operaciones.Sumar;

public class EsperandoOperacion implements Estados {
    private Calculadora contexto;

    public EsperandoOperacion(Calculadora contexto){
        this.contexto = contexto;
    }
    public String getResultado(){
        return contexto.imprimirResultado();
    }

    public void setValor(double unValor){
        contexto.setEstado(new Error());
    }

    public void mas(){
        // Indica que la calculadora debe esperar un nuevo valor
        contexto.setEstado(new EsperandoValor(contexto));
        contexto.setOperacion(new Sumar());
    }
    public void menos(){
        contexto.setEstado(new EsperandoValor(contexto));
        contexto.setOperacion(new Restar());
    }
    public void por(){
        contexto.setEstado(new EsperandoValor(contexto));
        contexto.setOperacion(new Multiplicar());
    }
    public void dividido(){
        contexto.setEstado(new EsperandoValor(contexto));
        contexto.setOperacion(new Dividir());
    }
}
