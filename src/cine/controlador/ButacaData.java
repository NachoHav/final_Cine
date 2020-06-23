
package cine.controlador;

import cine.modelo.Butaca;
import java.sql.Connection;
import java.sql.*;


public class ButacaData {
    private Connection con;
    private Conexion con2;
    
    public ButacaData(Conexion conexion){
        con = conexion.getConexion();
        con2 = conexion;
    }
    
    public ButacaData(){}
    
    public void altaButaca(Butaca butaca)
    {
        try 
        {   
            String sql = "INSERT INTO butaca (idProyeccion,fila,columna) VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setInt(1, butaca.getIdButaca());
            ps.setInt(1, butaca.getProyeccion().getIdProyeccion());
            ps.setString(2, butaca.getFila());
            ps.setString(3, butaca.getColumna());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) 
            {
                butaca.setIdButaca(rs.getInt(1));
                System.out.println("Se insertó la butaca.");                    
            } 
            else 
            {
                System.out.println("ERROR");
            }
            ps.close();    
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
    public boolean comprobarButaca(int idProyeccion, String fila, String columna){
        
        boolean encontrado = false;
        
        try{
            String query = "SELECT * FROM butaca WHERE idProyeccion = ? AND fila = ? AND columna = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idProyeccion);
            statement.setString(2,fila);
            statement.setString(3, columna);
            
            ResultSet rs = statement.executeQuery();
            
            if(rs.first())
                encontrado = true;
            
        }catch(SQLException ex){
            System.out.println("Error al comprobar la butaca" +ex.getMessage());
        } 
        
        return encontrado;
    }
    
    public Butaca obtenerButaca(int idButaca){
        Butaca butaca = null;
        ProyeccionData pd = new ProyeccionData(con2);
        
        try 
        {
            String query = "SELECT * FROM butaca WHERE idButaca = ?";

            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,idButaca);           
            
            ResultSet resultSet=statement.executeQuery();
            
            butaca = new Butaca();
            
            while(resultSet.next())
            {
                butaca.setIdButaca(resultSet.getInt("idButaca"));
                butaca.setProyeccion(pd.buscarProyeccion(resultSet.getInt("idProyeccion")));
                butaca.setFila("fila");
                butaca.setColumna("columna");
            }      
            statement.close();   
        } 
        catch (SQLException ex) 
        {
            System.out.println("ERROR: Consulta de butaca: " + ex.getMessage());
        }
        
        return butaca;
    }
    
}
