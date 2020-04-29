/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Clasificacion;

/**
 *
 * @author Bolaños Aldana
 */
public class ControlCategorias {
    
      public LinkedList<Clasificacion> consultarCategorias() {
        String sql="Select * from clientes;";
        Clasificacion objc=new Clasificacion();
        LinkedList<Clasificacion> listc=objc.buscarclasificacion(sql);
        
        return listc;
    }
}
