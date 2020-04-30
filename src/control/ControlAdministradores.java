/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Administrador;
import modelo.Clasificacion;

/**
 *
 * @author Bolaños Aldana
 */
public class ControlAdministradores {
    
      public LinkedList<Administrador> consultarAdministradores() {
        String sql="Select * from Administradores;";
        Administrador objc=new Administrador();
        LinkedList<Administrador> listc=objc.buscarAdministradores(sql);
        
        return listc;
    }
}
