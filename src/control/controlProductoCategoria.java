/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.ProductoCategoria;

/**
 *
 * @author Bolaños Aldana
 */
public class controlProductoCategoria {
    
     public LinkedList<ProductoCategoria> consultarProductoCategoria() {
        String sql="Select * from productos_categoria;";
        ProductoCategoria objc=new ProductoCategoria();
        LinkedList<ProductoCategoria> listc=objc.buscarProductoCategoria(sql);
        
        return listc;
    }
    
     public void insertarProductoCategoria(int idProd,int idCate){
       
        String sql="call weirdthings.insertarcuenta('"+idProd+"','"+idCate+"');";
        ProductoCategoria objc=new ProductoCategoria();
        objc.insertarCuenta(sql);
       
     }
     
}
