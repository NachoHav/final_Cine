/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.controlador.*;
import cine.modelo.Butaca;
import cine.modelo.Cliente;
import cine.modelo.Pelicula;
import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import cine.modelo.Ticket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
        PeliculaData pd = new PeliculaData(con);
        ProyeccionData prd = new ProyeccionData(con);
        SalaData sd = new SalaData(con);
        TicketData td = new TicketData(con);
        ButacaData bda = new ButacaData(con);
        
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
        
        // Alta, baja y modificacion de Pelicula:
        
        // Alta de Pelicula
        Pelicula pelicula1 = new Pelicula("Titulo de prueba 1");
        pd.altaPelicula(pelicula1);
        
        // Modificacion de Pelicula:
        Pelicula pelicula2 = new Pelicula("Titulo de prueba 2");
        pd.altaPelicula(pelicula2);
        pelicula2.setTitulo("Titulo Modificado 2");
        pd.modificarPelicula(pelicula2);
        
        // Baja de Pelicula:
        Pelicula pelicula3 = new Pelicula("Titulo de prueba 3");
        pd.altaPelicula(pelicula3);
        int P = pelicula3.getIdPelicula();
        pd.bajaPelicula(P);
        
        // FIN PRUEBAS PARA LA ENTREGA DEL 14/6
        
        Sala s = new Sala("Sala 1");
        sd.altaSala(s);
        Proyeccion p  = new Proyeccion(pelicula2, s, LocalTime.of(22, 30), LocalTime.of(23, 55));
        prd.altaProyeccion(p);
        
        /*Sala s2 = new Sala("Sala 2");
        sd.altaSala(s2);*/
        
        p.setPelicula(pelicula1);
        prd.modificarProyeccion(p);
        
        Proyeccion prueba1 = prd.buscarProyeccion(3);
        System.out.println(prueba1.getPelicula().getTitulo());
        Butaca b = new Butaca(s, "A", "B");
        bda.altaButaca(b);
        
        
        Ticket t = new Ticket(cliente1, p, b, LocalDate.of(2020, Month.JUNE, 20), 30, true, "prueba");
        td.generarTicket(t);
        
        
        //System.out.println(prd.buscarProyeccionXSalaYHorario(1, LocalTime.of(22, 30)).getIdProyeccion());
        
        /*Pelicula pruebaAgregada = pd.buscarPelicula(4);
        Proyeccion proyNueva = new Proyeccion(pruebaAgregada, s, LocalTime.of(22, 31), LocalTime.of(22, 32));
        prd.altaProyeccion(proyNueva);
        
        List<Proyeccion> proyeccionesXPelicula = new ArrayList<Proyeccion>();
        proyeccionesXPelicula = prd.obtenerProyeccionesXPelicula(4);
        for (Proyeccion prueba7 : proyeccionesXPelicula) {
            System.out.println(prueba7.getPelicula().getTitulo());
        }*/
        
        //prd.bajaProyeccion(p.getIdProyeccion());
        
        
        
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
