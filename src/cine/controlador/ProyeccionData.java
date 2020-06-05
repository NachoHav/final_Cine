
package cine.controlador;

import java.sql.Connection;


public class ProyeccionData {
    private Connection con;
    
    public ProyeccionData(Conexion conexion){
        
        con = conexion.getConexion();
        
    }

    public ProyeccionData() {
    }
       
}
