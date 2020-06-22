package cine.controlador;

import cine.modelo.Sala;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalaData {
    
    private Connection con;
    
    public SalaData (Conexion conexion)
    {    
        con = conexion.getConexion();
    }
    
    public SalaData(){}
    
    public void altaSala(Sala sala)
    {
        try {
            String sql = "INSERT INTO SALA (ubicacion,cantidadButacas) VALUES (?,?);";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, sala.getUbicacion());
            ps.setInt(2, sala.getCantButacas());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                sala.setIdSala(rs.getInt(1));
                sala.setCantButacas(rs.getInt(1));
            }
            else 
                System.out.println("No se pudo obtener id de sala luego de insertar sala");
            
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al dar de alta a la sala. ");
        }
    }
    
    public void bajaSala (int idSala)
    {
        try {
            String sql = "DELETE FROM SALA WHERE idSala="+idSala+";";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.executeUpdate();
            
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al dar de baja la sala. " + ex.getMessage());

        }
    }
    
    public void modificarSala(Sala sala)
    {
        try {
            String sql = "UPDATE sala SET ubicacion = ?, cantidadButacas = ? WHERE idSala="+sala.getIdSala()+";";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sala.getUbicacion());
            ps.setInt(2, sala.getCantButacas());
            ps.executeUpdate();
            
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al modificar la sala." + ex.getMessage());
        }
    }
    
    public Sala buscarSala(int idSala)
    {
        Sala sala = null;
        
        try 
        {
            String query = "SELECT * FROM sala WHERE idSala = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idSala);           
            
            ResultSet resultSet=statement.executeQuery();
            
            sala = new Sala();
            
            while(resultSet.next())
            {
                sala.setIdSala(resultSet.getInt("idSala"));
                sala.setUbicacion(resultSet.getString("ubicacion"));
                sala.setCantButacas(resultSet.getInt("cantidadButacas"));
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Consulta de Sala: " + ex.getMessage());
        }
        
        return sala;
    }
    
    public List<Sala> obtenerSalas(){
         List<Sala> salas = new ArrayList();
         
        try {   
            String sql = "SELECT * FROM sala";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Sala sala;
            
            while(rs.next()){
                sala = new Sala();
                sala.setIdSala(rs.getInt("idSala"));
                sala.setUbicacion(rs.getString("ubicacion"));
                sala.setCantButacas(rs.getInt("cantidadButacas"));
                
                salas.add(sala);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener las salas");
        }
        return salas;
    }
    
}




