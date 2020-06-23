
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
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProyeccionData {
    private Connection con;
    private Conexion con2;
    
    public ProyeccionData(Conexion conexion){
        
        con = conexion.getConexion();
        con2 = conexion;
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
                System.out.println("Se insertó la Proyección de la pelicula "+proyeccion.getPelicula().getTitulo()+" a las "+proyeccion.getHoraDesde() +" hs. de forma correcta!");                    
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
    
    public void bajaProyeccion(int id){
        try {
            String sql = "DELETE FROM PROYECCION WHERE idProyeccion=?;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            System.out.println("Se eliminó la Proyección de la pelicula"); 
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la proyección " + ex.getMessage());
        }
    }
    
    public void modificarProyeccion(Proyeccion proyeccion)
    {
        try {
            String sql = "UPDATE proyeccion SET idPelicula = ?, idSala=?, horario_desde= ? , horario_hasta= ? WHERE idProyeccion ="+proyeccion.getIdProyeccion()+";";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proyeccion.getPelicula().getIdPelicula());
            ps.setInt(2, proyeccion.getSala().getIdSala());
            ps.setTime(3, Time.valueOf(proyeccion.getHoraDesde()));
            ps.setTime(4, Time.valueOf(proyeccion.getHoraHasta()));
            ps.executeUpdate();
            
            System.out.println("Modificacion de proyección correcta.");
            ps.close();
            
        } catch (Exception ex) {
            System.out.println("Error al modificar la proyección. " + ex.getMessage());
        }
    }
    
    public Proyeccion buscarProyeccion(int idProyeccion)
    {
        Proyeccion pro = null;
        PeliculaData pd = new PeliculaData(con2);
        
        try 
        {
            String query = "SELECT * FROM proyeccion WHERE idProyeccion = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idProyeccion);           
            
            ResultSet resultSet=statement.executeQuery();
            
            pro = new Proyeccion();
            
            while(resultSet.next())
            {
                pro.setIdProyeccion(resultSet.getInt("idProyeccion"));
                pro.setPelicula(pd.buscarPelicula(resultSet.getInt("idPelicula")));
                pro.setHoraDesde(resultSet.getTime("horario_desde").toLocalTime());
                pro.setHoraHasta(resultSet.getTime("horario_hasta").toLocalTime());
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Consulta de proyeccion: " + ex.getMessage());
        }
        
        return pro;
    }
    
    public Proyeccion buscarProyeccionXSalaYHorario(int idSala, LocalTime horaInicio)
    {
        Proyeccion pro = null;
        PeliculaData pd = new PeliculaData(con2);
        
        try 
        {
            String query = "SELECT * FROM proyeccion WHERE idSala = ? AND horario_desde = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idSala);
            statement.setTime(2, Time.valueOf(horaInicio));
            
            ResultSet resultSet=statement.executeQuery();
            
            pro = new Proyeccion();
            
            while(resultSet.next())
            {
                pro.setIdProyeccion(resultSet.getInt("idProyeccion"));
                pro.setPelicula(pd.buscarPelicula(resultSet.getInt("idPelicula")));
                pro.setHoraDesde(resultSet.getTime("horario_desde").toLocalTime());
                pro.setHoraHasta(resultSet.getTime("horario_hasta").toLocalTime());
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Consulta de proyeccion: " + ex.getMessage());
        }
        
        return pro;
    }
    
    public List<Proyeccion> obtenerProyeccionesXPelicula(int idPelicula)
    {
        List<Proyeccion> proyeccionesXPelicula = new ArrayList<Proyeccion>();
        PeliculaData pd = new PeliculaData(con2);
        SalaData sd = new SalaData(con2);
    
        try 
        {
            String query = "SELECT * FROM proyeccion WHERE (proyeccion.idPelicula = ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, idPelicula);
            
            ResultSet resultSet = statement.executeQuery();
            
            Proyeccion proyeccion;
            
            while(resultSet.next())
            {
                proyeccion = new Proyeccion();
                proyeccion.setIdProyeccion(resultSet.getInt("idProyeccion"));
                proyeccion.setPelicula(pd.buscarPelicula(resultSet.getInt("idPelicula")));            
                proyeccion.setSala(sd.buscarSala(resultSet.getInt("idSala")));  
                proyeccion.setHoraDesde(resultSet.getTime("horario_desde").toLocalTime());
                proyeccion.setHoraHasta(resultSet.getTime("horario_hasta").toLocalTime());

                proyeccionesXPelicula.add(proyeccion);
            }      
            statement.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Obtención de alumnos: " + ex.getMessage());
        }
        
        return proyeccionesXPelicula;
    }
    
    public List<Proyeccion> obtenerProyecciones()
    {
        List<Proyeccion> proyecciones = new ArrayList<Proyeccion>();
    
        try 
        {
            String query = "SELECT * FROM proyeccion;";
                           
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            Proyeccion proyeccion;
            PeliculaData pd = new PeliculaData(con2);
            SalaData sd = new SalaData(con2);
            
            while(resultSet.next())
            {
                proyeccion = new Proyeccion();
                proyeccion.setIdProyeccion(resultSet.getInt("idProyeccion"));
                proyeccion.setPelicula(pd.buscarPelicula(resultSet.getInt("idPelicula")));            
                proyeccion.setSala(sd.buscarSala(resultSet.getInt("idSala")));
                proyeccion.setHoraDesde(resultSet.getTime("horario_desde").toLocalTime());
                proyeccion.setHoraHasta(resultSet.getTime("horario_hasta").toLocalTime());

                proyecciones.add(proyeccion);
            }      
            statement.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Obtención de proyecciones: " + ex.getMessage());
        }
        
        return proyecciones;
    }
    
    public List<LocalTime> obtenerHorariosDesde(){
        
        List<LocalTime> horarios = new ArrayList<>();
        
        try {        
            String sql = "SELECT DISTINCT horario_desde FROM proyeccion;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                horarios.add(rs.getTime("horario_desde").toLocalTime());
            }
            
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener lista de horarios! " + ex.getMessage());
        }
        
        return horarios;
    }
    
    public List<LocalTime> obtenerHorariosHasta(){
        
        List<LocalTime> horarios = new ArrayList<>();
        
        try {        
            String sql = "SELECT DISTINCT horario_hasta FROM proyeccion;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                horarios.add(rs.getTime("horario_hasta").toLocalTime());
            }
            
        } catch (SQLException ex) {
            System.out.println("No se pudo obtener lista de horarios! " + ex.getMessage());
        }
        
        return horarios;
    }
       
}
