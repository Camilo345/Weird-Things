/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

import java.util.LinkedList;
import seguridad.Administrador;
import modelo.Categoria;

/**
 *
 * @author Bolaños Aldana
 */
public class ControlAdministradores {
    
      public LinkedList<Administrador> consultarAdministradores() {
        String sql="Select * from administradores;";
        Administrador objc=new Administrador();
        LinkedList<Administrador> listc=objc.buscarAdministradores(sql);
        
        return listc;
    }
}
