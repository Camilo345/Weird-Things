/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Clasificaciones;

/**
 *
 * @author Bolaños Aldana
 */
public class ControlCategorias {
    
      public LinkedList<Clasificaciones> consultarCategorias() {
        String sql="Select * from clientes;";
        Clasificaciones objc=new Clasificaciones();
        LinkedList<Clasificaciones> listc=objc.buscarclasificacion(sql);
        
        return listc;
    }
}
