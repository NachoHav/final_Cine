
package cine.controlador;

import cine.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;


public class ClienteData {
    
    private Connection con;
    
    public ClienteData(Conexion conexion){
        
        con = conexion.getConexion();
        
    }

    public ClienteData() {
    }
    
    public void altaCliente(Cliente cliente){
        
        try {
            String sql = "INSERT INTO CLIENTE (nombre, apellido, dni) VALUES (?, ?, ?);";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getDni());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next())
                cliente.setIdCliente(rs.getInt(1));
            else
                System.out.println("No se pudo obtener id de cliente luego de insertar cliente");
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al dar de alta al cliente. " + ex.getMessage());
        }
    }
    
    public void bajaCliente(int id){
        
        try {
            String sql = "DELETE FROM CLIENTE WHERE idCliente = ?;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al dar de baja al cliente. " + ex.getMessage());
        }
    }
    
    public void modificarCliente(Cliente cliente)
    {
        try 
        {
            String sql = "UPDATE cliente SET nombre = ?, apellido=?, dni= ? WHERE idCliente ="+cliente.getIdCliente()+";";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getDni());
            
            ps.executeUpdate();
            
            ps.close();
            
        } catch (Exception ex) 
        {
            System.out.println("Error al modificar el cliente. " + ex.getMessage());
        }
    }
    
    public Cliente buscarcliente(int idCliente)
    {
        Cliente cliente = null;
        
        try 
        {
            String query = "SELECT * FROM cliente WHERE idCliente = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idCliente);           
            
            ResultSet resultSet=statement.executeQuery();
            
            cliente = new Cliente();
            
            while(resultSet.next())
            {
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));               
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getLong("dni"));
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Consulta de Cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
}

