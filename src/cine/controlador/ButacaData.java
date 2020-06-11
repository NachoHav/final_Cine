
package cine.controlador;

import java.sql.Connection;


public class ButacaData {
    private Connection con;
    
    public ButacaData(Conexion conexion){
        con = conexion.getConexion();
    }
    
    public ButacaData(){}
    
    
}
