/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luck
 */
public class Conector {
    
   // private static DataSource DataSource=null;
    public static Connection conexion=null;
    public static String mysql="com.mysql.jdbc.Driver";
    public static String Url="jdbc:mysql://104.236.88.111:3306/bd_inventario";
    public static String User="luk";
    public static String Pass="jesusguerrero";
    
   private Conector(){
      //Connection(); 
   }
    
    public static Connection Connection() 
    {
       try{
            if( conexion == null ){
               Class.forName(mysql);
               conexion= DriverManager.getConnection(Url,User,Pass);
            }
       } catch (SQLException e) {
       } catch (ClassNotFoundException ex ) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
       }
       // return DataSource;
         return conexion;
    }
    
    
     public static void liberaConexion(Connection cone) {
      cone = null;
      conexion = cone;
        
      //   conexion=null;
    }

    
    
}
