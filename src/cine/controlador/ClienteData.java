
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
            String sql = "DELETE FROM ALUMNO WHERE idCliente = ?;";
            
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
        try {
            String sql = "UPDATE cliente SET nombre = ?, apellido=?, dni= ? WHERE idCliente ="+cliente.getIdCliente()+";";
            
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getDni());
            
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al modificar el cliente. " + ex.getMessage());
        }
    }
    
    
    
}

