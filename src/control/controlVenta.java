/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.sql.JDBCType.DATE;
import static java.util.Calendar.DATE;
import java.util.LinkedList;
import modelo.Foto;
import modelo.Ventas;

/**
 *
 * @author Bolaños Aldana
 */
public class controlVenta {
    
     public LinkedList<Ventas> consultarVentas() {
        String sql="Select * from ventas;";
        Ventas objc=new Ventas();
        LinkedList<Ventas> listc=objc.buscarVentas(sql);
        
        return listc;
    }
     public void insertarVenta(int ventaTotal, String fechaVenta,String correo){
       
        String sql="call weirdthings.insertarProducto('"+ventaTotal+"','"+fechaVenta+"','"+correo+"');";
        Ventas objc=new Ventas();
        objc.insertarVentas(sql);
       
     }
}
