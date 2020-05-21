/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.DetallesVenta;

/**
 *
 * @author Bolaños Aldana
 */
public class controlDetallesVenta {
    
     public LinkedList<DetallesVenta> consultarDetallesVenta() {
        String sql="Select * from detalles_venta;";
        DetallesVenta objc=new DetallesVenta();
        LinkedList<DetallesVenta> listc=objc.buscarDetallesVenta(sql);
        
        return listc;
    }
    
      public void insertarDetallesVenta(String fechaPago,String fechaEntrega,String cantidad,int idProd){
       
        String sql="call weirdthings.insertarcuenta('"+fechaPago+"','"+fechaEntrega+"','"+cantidad+"','"+idProd+"');";
        DetallesVenta objc=new DetallesVenta();
        objc.insertarCuenta(sql);
       
     }
     
}
