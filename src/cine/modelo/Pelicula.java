package cine.modelo;

import java.time.LocalDate;



public class Pelicula {

    private int idPelicula = -1;
    private String titulo;

    public Pelicula() {
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    

}
