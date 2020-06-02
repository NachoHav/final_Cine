package cine.modelo;

import java.time.LocalDate;



public class Pelicula {
    private Sala sala;
    private String nombre;
    private LocalDate fechaYHora;
    
    public Pelicula() {
    }

    public Pelicula(Sala sala, String nombre, LocalDate fechaYHora) {
        this.sala = sala;
        this.nombre = nombre;
        this.fechaYHora = fechaYHora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    
    
    
}
