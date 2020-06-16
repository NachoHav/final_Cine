
package cine.controlador;

import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ProyeccionData {
    private Connection con;
    
    public ProyeccionData(Conexion conexion){
        
        con = conexion.getConexion();
        
    }

    public ProyeccionData() 
    {
    }
    
    public void guardarProyeccion(Proyeccion proyeccion)
    {
        try 
        {   
            String query = "INSERT INTO proyeccion (idPelicula,idSala,horario_desde,horario_hasta) VALUES (?,?,?,?)";

            PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, materia.getNombre());

            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) 
            {
                materia.setId(rs.getInt(1));
                System.out.println("Se insertó la Materia "+materia.getNombre()+" de forma correcta!");                    
            } 
            else 
            {
                System.out.println("ERROR: Obtención de ID luego de inserción de Materia");
            }
            statement.close();    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Inserción Materia: " + ex.getMessage());
        }
    }
    
    public List<Proyeccion> obtenerProyecciones(Sala sala,LocalDate horario)
    {
        List<Proyeccion> proyecciones = new ArrayList<Proyeccion>();
    
        try 
        {
            String query = "SELECT * FROM proyeccion "
                            + "WHERE (proyeccion.idSala = ?) AND "
                            + "((proyeccion.horario_desde <= '?') AND (proyeccion.horario_hasta >= '?'))";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, sala.getIdSala());
            statement.setObject(2, horario);
            statement.setObject(3, horario);
            
            ResultSet resultSet = statement.executeQuery();
            
            Proyeccion proyeccion;
            
            while(resultSet.next())
            {
                proyeccion = new Proyeccion();
                proyeccion.setIdProyeccion(resultSet.getInt("idProyeccion"));
                proyeccion.setPelicula(resultSet.getInt("idPelicula"));              
                proyeccion.setSala(resultSet.getInt("idSala"));

                proyecciones.add(proyeccion);
            }      
            statement.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Obtención de alumnos: " + ex.getMessage());
        }
        
        return proyecciones;
    }
       
}
