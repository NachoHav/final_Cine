
package cine.controlador;

import cine.modelo.Proyeccion;
import cine.modelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
    
    public void altaProyeccion(Proyeccion proyeccion)
    {
        try 
        {   
            String sql = "INSERT INTO proyeccion (idPelicula,idSala,horario_desde,horario_hasta) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proyeccion.getPelicula().getIdPelicula());
            ps.setInt(2, proyeccion.getSala().getIdSala());
            ps.setTime(3, Time.valueOf(proyeccion.getHoraDesde()));
            ps.setTime(4, Time.valueOf(proyeccion.getHoraHasta()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) 
            {
                proyeccion.setIdProyeccion(rs.getInt(1));
                System.out.println("Se insertó la Proyección de la pelicula "+proyeccion.getPelicula().getTitulo()+" a las "+proyeccion.getHoraDesde() +"de forma correcta!");                    
            } 
            else 
            {
                System.out.println("ERROR");
            }
            ps.close();    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Inserción Proyección: " + ex.getMessage());
        }
    }
    
    /*public List<Proyeccion> obtenerProyecciones(Sala sala,LocalDate horario)
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
    }*/
       
}
