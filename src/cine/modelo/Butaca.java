
package cine.modelo;


public class Butaca {
    
    private int idButaca = -1;
    private Sala sala;
    private String fila, columna;

    public Butaca() {
    }

    public Butaca(Sala sala, String fila, String columna) {
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

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }
    
    
    
}
