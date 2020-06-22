
package cine.modelo;


public class Butaca {
    
    private int idButaca = -1;
    private Proyeccion proyeccion;
    private String fila, columna;

    public Butaca() {
    }

    public Butaca(Proyeccion proyeccion, String fila, String columna) {
        this.proyeccion = proyeccion;
        this.fila = fila;
        this.columna = columna;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
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
