
package cine.modelo;


public class Butaca {
    
    private int idButaca;
    private Sala sala;
    private int fila, columna;

    public Butaca() {
    }

    public Butaca(Sala sala, int fila, int columna) {
        this.sala = sala;
        this.fila = fila;
        this.columna = columna;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
