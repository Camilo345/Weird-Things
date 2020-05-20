/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Bolaños Aldana
 */
public class ProductoCategoria {
    
    int IDCatePG;
    int IDProductof2;
    int IDCateef;

    public ProductoCategoria() {
    }

    public ProductoCategoria(int IDCatePG, int IDProductof2, int IDCateef) {
        this.IDCatePG = IDCatePG;
        this.IDProductof2 = IDProductof2;
        this.IDCateef = IDCateef;
    }

    public int getIDCatePG() {
        return IDCatePG;
    }

    public void setIDCatePG(int IDCatePG) {
        this.IDCatePG = IDCatePG;
    }

    public int getIDProductof2() {
        return IDProductof2;
    }

    public void setIDProductof2(int IDProductof2) {
        this.IDProductof2 = IDProductof2;
    }

    public int getIDCateef() {
        return IDCateef;
    }

    public void setIDCateef(int IDCateef) {
        this.IDCateef = IDCateef;
    }

    @Override
    public String toString() {
        return "ProductoCategoria{" + "IDCatePG=" + IDCatePG + ", IDProductof2=" + IDProductof2 + ", IDCateef=" + IDCateef + '}';
    }

    public LinkedList<ProductoCategoria> buscarProductoCategoria(String sql) {
        
         ResultSet rs = null;
        LinkedList<ProductoCategoria> lpc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int IDCatePG2;
        int IDProductof22;
        int IDCateef2;
     
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IDCatePG2 = rs.getInt("IDCatePG");
                    IDProductof22 = rs.getInt("IDProductof22");
                    IDCateef2 = rs.getInt("IDCateef");
                 
                    lpc.add(new ProductoCategoria(IDCatePG2, IDProductof22,IDCateef2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lpc;
        
    }

    public void insertarCuenta(String sql) {
      ResultSet rs = null;
         BaseDatos objcone = new BaseDatos();
          if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
               
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
    }
    }
    
    
    
}
