/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Categoria;

/**
 *
 * @author Bolaños Aldana
 */
public class controlCategoria {
    
     public LinkedList<Categoria> consultarCategorias() {
        String sql="Select * from Categorias;";
        Categoria objc=new Categoria();
        LinkedList<Categoria> listc=objc.buscarCategorias(sql);
        
        return listc;
    }
    
}
