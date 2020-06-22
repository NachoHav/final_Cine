
package cine.modelo;

import java.time.LocalDate;
import java.time.LocalTime;


public class Proyeccion {
    private int idProyeccion = -1;
    private Pelicula pelicula;
    private Sala sala;
    
    private LocalTime horaDesde;
    private LocalTime horaHasta;

    public Proyeccion() {
    }

    public Proyeccion(Pelicula pelicula, Sala sala, LocalTime horaDesde, LocalTime horaHasta) {
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

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }   

    @Override
    public String toString() {
        return "ID:"+idProyeccion +" "+ pelicula.getTitulo() +"(" + horaDesde + " - " + horaHasta+")";
    }
    
    
}
