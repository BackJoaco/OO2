package com.patterns;

import java.util.List;

public class Excursion {
    private List<Usuario> usuarios;
    private List<Usuario> listaEspera;
    private String nombre;
    private java.util.Date fechaInicio;
    private java.util.Date fechaFin;
    private String puntoDeEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private EstadoExcursion state;

    public Excursion(String nombre, java.util.Date fechaInicio, java.util.Date fechaFin,
            String puntoDeEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
        this.usuarios = new java.util.ArrayList<>();
        this.listaEspera = new java.util.ArrayList<>();
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.state = new EstadoProvisorio();
    }
    public int getCantInscriptos() {
        return usuarios.size();
    }
    public int getCupoMaximo() {
        return cupoMaximo;
    }
    public int getCupoMinimo() {
        return cupoMinimo;
    }
    public String getNombre() {
        return nombre;
    }
    public java.util.Date getFechaInicio() {
        return fechaInicio;
    }
    public java.util.Date getFechaFin() {
        return fechaFin;
    }
    public String getPuntoDeEncuentro() {
        return puntoDeEncuentro;
    }
    public double getCosto() {
        return costo;
    }
    public void inscribirUsuario(Usuario unUsuario) {
        this.usuarios.add(unUsuario);
    }
    public void inscribir(Usuario unUsuario){
        state.inscribir(this, unUsuario);
    }
    public String obtenerInformacion(){
        return state.obtenerInformacion(this);
    }
    public void setState(EstadoExcursion state) {
        this.state = state;
    }
    public List<String> getMails(){
        List<String> mails = new java.util.ArrayList<>();
        for (Usuario usuario : usuarios) {
            mails.add(usuario.getEmail());
        }
        return mails;
    }
    public void inscribirUsuarioEnListaEspera(Usuario unUsuario) {
        this.listaEspera.add(unUsuario);
    }
}
