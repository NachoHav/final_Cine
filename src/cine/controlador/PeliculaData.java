
package cine.controlador;

import cine.modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PeliculaData {
    
    private Connection con;
    
    public PeliculaData(Conexion conexion){
        con = conexion.getConexion();
    }
    
    public PeliculaData(){
    }
    
    public void altaPelicula(Pelicula pelicula){
        
        try {
            
            String sql = "INSERT INTO PELICULA (titulo) VALUES (?);";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pelicula.getTitulo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next())
                pelicula.setIdPelicula(rs.getInt(1));
            else
                System.out.println("No se pudo obtener id de cliente luego de insertar cliente");
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("No se pudo dar de alta a la pelicula. "+ ex.getMessage());
        }
    }
    
    public void bajaPelicula(int id){
        try {
            String sql = "DELETE FROM PELICULA WHERE idPelicula=?;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("No se pudo dar de baja a la pelicula. " + ex.getMessage());
        }
    }
    
    public void modificarPelicula(Pelicula pelicula)
    {
        try {
            String sql = "UPDATE pelicula SET titulo = ? WHERE idPelicula ="+pelicula.getIdPelicula()+";";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pelicula.getTitulo());
            ps.executeUpdate();
            
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al modificar la pelicula. " + ex.getMessage());
        }
    
    }
    
    public Pelicula buscarPelicula(int idPelicula)
    {
        Pelicula p = null;
        
        try 
        {
            String query = "SELECT * FROM pelicula WHERE idPelicula = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idPelicula);           
            
            ResultSet resultSet=statement.executeQuery();
            
            p = new Pelicula();
            
            while(resultSet.next())
            {
                p.setIdPelicula(resultSet.getInt("idPelicula"));
                p.setTitulo(resultSet.getString("titulo"));
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error al buscar la pelicula: " + ex.getMessage());
        }
        
        return p;
    }
    
    public List<Pelicula> obtenerPeliculas()
    {
        List<Pelicula> peliculas = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM pelicula;";
            
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            Pelicula pelicula;
            while (resultSet.next()) {
                pelicula = new Pelicula();
                pelicula.setIdPelicula(resultSet.getInt("idPelicula"));
                pelicula.setTitulo(resultSet.getString("titulo"));
                
                peliculas.add(pelicula);
            }
            preparedStatement.close();
        } catch (Exception ex) {
            System.out.println("Error al obtener las peliculas: " + ex.getMessage());
        }
        
        return peliculas;
    }
    
}


