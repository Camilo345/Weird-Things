/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashMap;
import java.util.LinkedList;
import modelo.Clasificaciones;

import modelo.Categorias;


/**
 *
 * @author Bolaños Aldana
 */
public class controlCategoria {

//     public LinkedList<Categorias> consultarCategorias() {
//        String sql="Select * from categorias;";
//        Categorias objc=new Categorias();
//        LinkedList<Categorias> listc=objc.buscarCategorias(sql);
//        return listc;
//    }     
     public HashMap<Integer, String> consultarCategorias() {
       

        HashMap<Integer, String> be = new HashMap<>();
        String sql = "select * from categorias;";
        Categorias objbe = new Categorias();
        be = objbe.buscarCategorias(sql);
        
        return be;

    }
     
     public void insertarCategoria(String categoria){
       
        String sql="call weirdthings.insertarCategoria('"+categoria+"');";
        Categorias objc=new Categorias();
        objc.insertarCategoria(sql);
       
     }
     
     
}
