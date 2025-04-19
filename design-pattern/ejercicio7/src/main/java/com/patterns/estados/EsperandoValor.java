package com.patterns.estados;
import com.patterns.Calculadora;
public class EsperandoValor implements Estados {
    private Calculadora contexto;

    public EsperandoValor(Calculadora contexto){
        this.contexto = contexto;
    }
    public String getResultado(){
        return contexto.imprimirResultado();
    }


    public void setValor(double unValor){
        contexto.calcular(unValor);
        contexto.setEstado(new EsperandoOperacion(contexto));
    }   

    public void mas(){
        contexto.setEstado(new Error());
    }
    public void menos(){
        contexto.setEstado(new Error());
    }
    public void por(){
        contexto.setEstado(new Error());
    }
    public void dividido(){
        contexto.setEstado(new Error());
    }
}
