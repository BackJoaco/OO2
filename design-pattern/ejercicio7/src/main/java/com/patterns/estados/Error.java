package com.patterns.estados;


public class Error implements Estados {

    public String getResultado() {
        return "error";
    }


    public void setValor(double unValor) {
    }

    @Override
    public void mas() {
    }

    @Override
    public void menos() {
    }

    @Override
    public void por() {
    }

    @Override
    public void dividido() {
    }
    
}
