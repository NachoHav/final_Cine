/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.modelo;

import java.time.LocalDate;

/**
 *
 * @author Pablo
 */
public class Ticket {
    
    private Sala sala;
    private Pelicula pelicula;
//    private Butaca butaca;
    private LocalDate horario;
    private double monto;
    
    public Ticket(){}

    public Ticket(Sala sala, Pelicula pelicula,/*Butaca butaca*/ double monto) {
        this.sala = sala;
        this.pelicula = pelicula;
//        this.butaca = butaca;
        this.monto = monto;
    }

    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getHorario() {
        return pelicula.getFechaYHora();
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
