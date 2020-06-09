/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.controlador.*;
import cine.modelo.Cliente;
import cine.modelo.Ticket;

/**
 *
 * @author nacho
 */
public class testCine 
{
    public static void main(String[] args) 
    {
        Conexion con = new Conexion();
        con.getConexion();

        Cliente cliente = new Cliente(12345679,"Laura","Garcia");
        ClienteData cd = new ClienteData(con);
        cd.altaCliente(cliente);
        //cd.bajaCliente(3);
        cliente.setNombre("María");
        cd.modificarCliente(cliente);

        /*Cliente prueba = new Cliente(123,"NombrePrueba", "ApellidoPrueba");
        ClienteData cd = new ClienteData(con);
        cd.altaCliente(prueba);
        prueba.setApellido("Pruebasss");
        cd.modificarCliente(prueba);*/

    }
}
