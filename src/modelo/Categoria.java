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
public class Categoria {
    private int IDCate;
    private String nombreCategoria; 

    public Categoria() {
    }

    public Categoria(int IDCate, String nombreCategoria) {
        this.IDCate = IDCate;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIDCate() {
        return IDCate;
    }

    public void setIDCate(int IDCate) {
        this.IDCate = IDCate;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "IDCate=" + IDCate + ", nombreCategoria=" + nombreCategoria + '}';
    }

    public LinkedList<Categoria> buscarCategorias(String sql) {
        
     ResultSet rs = null;
        LinkedList<Categoria> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idc;
        String nombreCategorias;
     
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("IDCate");
                    nombreCategorias = rs.getString("nombreCategoria");
                 
                    lc.add(new Categoria(idc, nombreCategorias));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
        
    }
    
    
}
