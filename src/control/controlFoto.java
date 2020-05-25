/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Fotos;

/**
 *
 * @author Bolaños Aldana
 */
public class controlFoto {
    
     public LinkedList<Fotos> consultarFoto() {
        String sql="Select * from foto;";
        Fotos objc=new Fotos();
        LinkedList<Fotos> listc=objc.buscarFoto(sql);
        
        return listc;
    }
    
     public void EliminarFoto(int idFoto){
       
        String sql="call eliminarProducto('"+idFoto+"');";
        Fotos objc=new Fotos();
        objc.EliminarFoto(sql);
       
     }
     
     public LinkedList<Fotos> TraerFoto(){
       String sql="Select * from foto;";
        Fotos objc=new Fotos();
        LinkedList<Fotos> listc=objc.imagen(sql);
        
        return listc;
       
     }     
}
