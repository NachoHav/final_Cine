
package cine.controlador;

import cine.modelo.Butaca;
import java.sql.Connection;
import java.sql.*;


public class ButacaData {
    private Connection con;
    
    public ButacaData(Conexion conexion){
        con = conexion.getConexion();
    }
    
    public ButacaData(){}
    
    public void altaButaca(Butaca butaca)
    {
        try 
        {   
            String sql = "INSERT INTO butaca (idButaca,idSala,fila,columna) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, butaca.getIdButaca());
            ps.setInt(2, butaca.getSala().getIdSala());
            ps.setString(3, butaca.getFila());
            ps.setString(4, butaca.getColumna());

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
    
}
