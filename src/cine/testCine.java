/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.controlador.*;
import cine.modelo.Cliente;
import cine.modelo.Ticket;
import java.time.LocalDate;

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
        ClienteData cd = new ClienteData(con);
        
        // PRUEBAS PARA LA ENTREGA DEL 14/6 - NO BORRAR-
        // Alta, baja y modificacion de Clientes:
        
        // Alta Cliente:
        Cliente cliente1 = new Cliente(1,"Cliente1","Prueba1");
        cd.altaCliente(cliente1);
        
        // Modificacion Cliente:
        Cliente cliente2 = new Cliente(2,"Cliente2","Prueba2");
        cd.altaCliente(cliente2);
        cliente2.setNombre("Modificado");
        cd.modificarCliente(cliente2);
        
        // Baja Cliente:
        Cliente cliente3 = new Cliente(3,"Cliente3","Prueba3");
        cd.altaCliente(cliente3);
        int id = cliente3.getIdCliente();
        cd.bajaCliente(id);
        // FIN PRUEBAS PARA LA ENTREGA DEL 14/6
        
        
        // OTRAS PRUEBAS:
        //ProyeccionData pd = new ProyeccionData(con);
        //cd.altaCliente(cliente);
        //cd.bajaCliente(3);
        //cliente.setNombre("María");
        //cd.modificarCliente(cliente);
        
        /*System.out.println(cd.buscarcliente(1).getIdCliente());
        System.out.println(pd.);
        
        Ticket ticket = new Ticket(cliente, proyeccion, butaca, LocalDate.MIN, 0, true, metodo_pago);*/

    }
}
