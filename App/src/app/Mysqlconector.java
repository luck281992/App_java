/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource; 
import org.apache.commons.dbcp.BasicDataSource;
/**
 *
 * @author luck
 */
public class Mysqlconector {
    
    private static DataSource DataSource=null;
   // public static Connection conexion=null;
    public  String mysql="com.mysql.jdbc.Driver";
    public  String Url="jdbc:mysql://104.236.88.111:3306/bd_inventario";
    public  String User="luk";
    public  String Pass="jesusguerrero";
    
   public Mysqlconector(){
     // Connection(); 
   }
    
    public  DataSource Connection() 
    {
        if( DataSource == null ){
            BasicDataSource basicDataSource = new BasicDataSource();
            basicDataSource.setDriverClassName(mysql);
            basicDataSource.setUrl(Url);
            basicDataSource.setUsername(User);
            basicDataSource.setPassword(Pass);
            basicDataSource.setMaxActive(50);
            DataSource =  basicDataSource;
        }
        return DataSource;
       //  return conexion;
    }
    
    
     public static void liberaConexion(Connection conexion) {
       try {
                // En realidad no cierra, solo libera la conexion.
             conexion.close();
        } catch (SQLException ex) {
              Logger.getLogger(Mysqlconector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //   conexion=null;
    }

    
    
}
