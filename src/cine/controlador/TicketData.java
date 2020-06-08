/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.controlador;

import cine.modelo.Cliente;
import cine.modelo.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Laura
 */
public class TicketData 
{
    private Connection con = null;

    public TicketData(Conexion conexion) 
    {
        con = conexion.getConexion();
    }
    
    public void generarTicket(Ticket ticket)
    {
        try 
        {
            String query = "INSERT INTO ticket (idCliente,idProyeccion,idButaca,fecha_ticket,monto,estado,metodo_pago) VALUES (?,?,?,?,?,?)";

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
}
