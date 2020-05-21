/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Categorias;
import modelo.Productos;

/**
 *
 * @author Bolaños Aldana
 */
public class controlProducto {
    
     public LinkedList<Productos> consultarProducto() {
        String sql="Select * from producto;";
        Productos objc=new Productos();
        LinkedList<Productos> listc=objc.buscarProducto(sql);
        
        return listc;
    }
     public void insertarProducto(String nombreProducto,String Descripcion,int precio,int clientesT,int unidades){
       
        String sql="call weirdthings.insertarProducto('"+nombreProducto+"','"+Descripcion+"','"+precio+"','"+clientesT+"','"+unidades+"');";
        Productos objc=new Productos();
        objc.insertarProducto(sql);
       
     }
      public void EliminarProducto(String nombreProducto){
       
        String sql="call eliminarProducto('"+nombreProducto+"');";
        Productos objc=new Productos();
        objc.EliminarProducto(sql);
       
     }
}
