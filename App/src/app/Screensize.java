/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author luck
 */
public class Screensize {
    int alto;
    int ancho;
    public  Screensize(){
       this.ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       this.alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    }
    public Screensize(int alto,int ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
    public int altura(){
        return alto;
    }   
    public int ancho(){
        return ancho;
    }
}
