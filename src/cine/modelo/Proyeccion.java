
package cine.modelo;

import java.time.LocalDate;


public class Proyeccion {
    private int idProyeccion = -1;
    private Pelicula pelicula;
    private Sala sala;
    
    private LocalDate horaDesde;
    private LocalDate horaHasta;

    public Proyeccion() {
    }

    public Proyeccion(Pelicula pelicula, Sala sala, LocalDate horaDesde, LocalDate horaHasta) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
    }
    
    public int getIdProyeccion() 
    {
        return idProyeccion;
    }

    public void setIdProyeccion(int idProyeccion) 
    {
        this.idProyeccion = idProyeccion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalDate horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalDate getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalDate horaHasta) {
        this.horaHasta = horaHasta;
    }   
}
