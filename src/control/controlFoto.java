/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Foto;

/**
 *
 * @author Bolaños Aldana
 */
public class controlFoto {
    
     public LinkedList<Foto> consultarFoto() {
        String sql="Select * from foto;";
        Foto objc=new Foto();
        LinkedList<Foto> listc=objc.buscarFoto(sql);
        
        return listc;
    }
    
     public void EliminarFoto(int idFoto){
       
        String sql="call eliminarProducto('"+idFoto+"');";
        Foto objc=new Foto();
        objc.EliminarFoto(sql);
       
     }
     
}
