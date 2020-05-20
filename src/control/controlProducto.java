/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Categoria;
import modelo.Producto;

/**
 *
 * @author Bolaños Aldana
 */
public class controlProducto {
    
     public LinkedList<Producto> consultarProducto() {
        String sql="Select * from producto;";
        Producto objc=new Producto();
        LinkedList<Producto> listc=objc.buscarProducto(sql);
        
        return listc;
    }
     public void insertarProducto(String nombreProducto,String Descripcion,int precio,int clientesT,int unidades){
       
        String sql="call weirdthings.insertarProducto('"+nombreProducto+"','"+Descripcion+"','"+precio+"','"+clientesT+"','"+unidades+"');";
        Producto objc=new Producto();
        objc.insertarProducto(sql);
       
     }
      public void EliminarProducto(String nombreProducto){
       
        String sql="call eliminarProducto('"+nombreProducto+"');";
        Producto objc=new Producto();
        objc.EliminarProducto(sql);
       
     }
}
