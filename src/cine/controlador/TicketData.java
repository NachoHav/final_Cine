/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.controlador;

import cine.modelo.Butaca;
import cine.modelo.Cliente;
import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import cine.modelo.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Laura
 */
public class TicketData 
{
    private Connection con = null;
    private Conexion con2;

    public TicketData(Conexion conexion) 
    {
        con = conexion.getConexion();
        con2 = conexion;
    }
    
    public void generarTicket(Ticket ticket)
    {
        try 
        {
            String query = "INSERT INTO ticket (idCliente,idProyeccion,idButaca,fecha_ticket,monto,estado,metodo_pago) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,ticket.getCliente().getIdCliente());
            statement.setInt(2,ticket.getProyeccion().getIdProyeccion());
            statement.setInt(3,ticket.getButaca().getIdButaca());           
            statement.setObject(4,ticket.getFecha_ticket());  
            statement.setDouble(5,ticket.getMonto());  
            statement.setInt(6,1);
            statement.setString(7,ticket.getMetodo_pago());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) 
            {
                ticket.setIdTicket(rs.getInt("idTicket"));
                
                Cliente c = ticket.getCliente();
                
                System.out.println("Se generó el Ticket nro "+rs.getInt("idTicket")+" a nombre de "+c.getApellido()+", "+c.getNombre()); 
            } 
            else 
            {
                System.out.println("No se pudo obtener el id luego de generar el Ticket");
            }
            statement.close();
    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Generación Ticket " + ex.getMessage());
        }
    }
    
    public void modificarTicket(Ticket ticket)
    {
        try 
        {
            String query = "UPDATE ticket SET idCliente = ?,idProyeccion = ?,idButaca = ?,fecha_ticket = ?,monto = ?,estado = ?,metodo_pago = ? WHERE idTicket = ?";

            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,ticket.getCliente().getIdCliente());
            statement.setInt(2,ticket.getProyeccion().getIdProyeccion());
            statement.setInt(3,ticket.getButaca().getIdButaca());           
            statement.setObject(4,ticket.getFecha_ticket());  
            statement.setDouble(5,ticket.getMonto());  
            statement.setBoolean(6,ticket.isEstado());
            statement.setString(7,ticket.getMetodo_pago());
            statement.setInt(8,ticket.getIdTicket());
           
            if(statement.executeUpdate() == 1)
            {
                System.out.println("Se modificó el Ticket de forma correcta");
            }
            else
            {
                System.out.println("El Ticket a modificar no se encontró en la Base de Datos!");
            }           
            
            statement.close();
    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Modificación Ticket " + ex.getMessage());
        }    
    }
    
    public List<Butaca> getButacasLibres(Proyeccion proyeccion, Sala sala)
    {
        List<Butaca> butacas = new ArrayList<Butaca>();
        
        try 
        {
            String query = "SELECT butaca.idButaca,\n" +
                            "butaca.fila,\n" +
                            "butaca.columna\n" +
                            "FROM butaca\n" +
                            "WHERE butaca.idButaca NOT IN (SELECT ticket.idButaca\n" +
                            "FROM ticket\n" +
                            "JOIN butaca\n" +
                            "ON ticket.idButaca = butaca.idButaca\n" +
                            "WHERE ((ticket.idProyeccion = ?) AND \n" +
                            "(YEAR(ticket.fecha_ticket) = YEAR(NOW()) AND\n" +
                            "MONTH(ticket.fecha_ticket) = MONTH(NOW()) AND\n" +
                            "DAY(ticket.fecha_ticket) = DAY(NOW())))) AND\n" +
                            "(butaca.idSala = ?)";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,proyeccion.getIdProyeccion());
            statement.setInt(2,sala.getIdSala());
           
            ResultSet resultSet = statement.executeQuery();
            Butaca butaca;
            while(resultSet.next())
            {
                butaca = new Butaca();
                butaca.setIdButaca(resultSet.getInt("idButaca"));
                butaca.setFila(resultSet.getString("fila"));              
                butaca.setColumna(resultSet.getString("columna"));              

                butacas.add(butaca);
            }      
            statement.close();    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Butacas Libres " + ex.getMessage());
        }    
        
        return butacas;
    }
    
    public List<Ticket> obtenerTicketXFecha(LocalDate fecha)
    {
        List<Ticket> ticketsXFecha = new ArrayList<Ticket>();
        ClienteData cd = new ClienteData(con2);
        ProyeccionData pd = new ProyeccionData(con2);
    
        try 
        {
            String query = "SELECT * FROM ticket WHERE fecha_ticket = ?";
            PreparedStatement statement = con.prepareStatement(query);

            statement.setObject(1, fecha);
            
            ResultSet resultSet = statement.executeQuery();
            
            Ticket ticket;
            
            while(resultSet.next())
            {
                ticket = new Ticket();
                ticket.setIdTicket(resultSet.getInt("idTicket"));
                ticket.setCliente(cd.buscarcliente(resultSet.getInt("idCliente")));
                ticket.setProyeccion(pd.buscarProyeccion(resultSet.getInt("idProyeccion")));
                ticket.setFecha_ticket(resultSet.getDate("fecha_ticket").toLocalDate());
                ticket.setMonto(resultSet.getDouble("monto"));
                ticket.setMetodo_pago(resultSet.getString("metodo_pago"));
                
                ticketsXFecha.add(ticket);
            }      
            statement.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Obtención de tickets: " + ex.getMessage());
            
        }
        
        return ticketsXFecha;
    }
}
