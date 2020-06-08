
package cine.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private String url = "jdbc:mysql://localhost/cine";
    private String usuario = "root";
    private String password = "";
    private Connection conexion;

    public Conexion(String url, String usuario, String password) {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Conexion()
    {
        try 
        {  
            Class.forName("org.mariadb.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public Connection getConexion(){
        
        if(conexion == null){              
            try {
                conexion = DriverManager.getConnection(url, usuario, password);         
            } catch (SQLException ex) {
                System.out.println("Error " + ex.getMessage());          
            }
        }
        return conexion;
    }
}