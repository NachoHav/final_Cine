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
public class Cliente {
    
    private int dni;
    private String nombre;
    
    public Cliente (){}
    
    public Cliente (Ticket ticket, int dni, String nombre)
    {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
