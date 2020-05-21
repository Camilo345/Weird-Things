/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Calificaciones;

/**
 *
 * @author Bolaños Aldana
 */
public class controlCalificaciones {
    
     public LinkedList<Calificaciones> consultarCalificaciones() {
        String sql="Select * from calificaciones;";
        Calificaciones objc=new Calificaciones();
        LinkedList<Calificaciones> listc=objc.buscarCalificaciones(sql);
        
        return listc;
    }
    
}
