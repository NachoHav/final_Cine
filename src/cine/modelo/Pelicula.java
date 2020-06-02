package cine.modelo;

import java.time.LocalDate;



public class Pelicula {
    Sala sala;
    private boolean butaca = true;
    private LocalDate fechaYHora;
    private float montoEntrada;

    public Pelicula() {
    }

    public Pelicula(Sala sala, LocalDate fechaYHora, float montoEntrada) {
        this.sala = sala;
        this.fechaYHora = fechaYHora;
        this.montoEntrada = montoEntrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public boolean isButaca() {
        return butaca;
    }

    public void setButaca(boolean butaca) {
        this.butaca = butaca;
    }

    public LocalDate getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public float getMontoEntrada() {
        return montoEntrada;
    }

    public void setMontoEntrada(float montoEntrada) {
        this.montoEntrada = montoEntrada;
    }
    
    
}
