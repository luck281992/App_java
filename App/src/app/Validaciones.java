/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
   private static final String PATTERN_EMAIL = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.([a-zA-Z]{2,4})+$";
   
   private static final String PATTERN_TELEFONO= "^(\\d{3}|\\(\\d{3}\\))-\\d{3}-\\d{2}-\\d{2}$";
   
   private static final String PATTERN_FECHA= "^\\d{1}/\\d{2}/\\d{4}$";
   
   private static final String PATTERN_USERNAME= "^[a-zA-Z0-9._-]+$";
   
    public static boolean validateEmail(String email) {
 
        
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
    public static boolean validatePrecio(String decimal) {     
        try
        {
          Double.parseDouble(decimal);
          return true;
        }
        catch(NumberFormatException nfe)
        {
          return false;
        }
    }
    public static boolean validateTelefono(String telefono)
    {
    
        Pattern pattern = Pattern.compile(PATTERN_TELEFONO);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }
    
    public static boolean validateFecha(String fecha)
    {
    
        Pattern pattern = Pattern.compile(PATTERN_FECHA);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }  
    
   @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public  static int validatePassword(String pass)
    {
        if(pass.length()<8)
            return 1;
        
        if(pass.length()>30)
            return 2;
        
        
            return 0;   
    } 
   @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public  static int validateUsername(String user)
    {
        if(user.length()< 6)
            return 1;
        
        if(user.length()>30 )
            return 2;
        
        
            return 0;   
    } 
    
    public static boolean valiUsername(String user)
    {
       
        Pattern pattern = Pattern.compile(PATTERN_USERNAME);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(user);
        return matcher.matches();

    } 
}
