/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.modelo;

/**
 *
 * @author nacho
 */
public class Sala {
    
    private int idSala = -1;
    private String ubicacion;

    public Sala() {
    }

    public Sala(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "ID:" + idSala + " - " + ubicacion;
    }
    
    
}
