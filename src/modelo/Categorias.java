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
public class Categorias {
    
    private int idCate;

        private String nombreCategoría;
        
    public Categorias() {
    }

    public Categorias(int idCate, String nombreCategoría) {
        this.idCate = idCate;
        this.nombreCategoría = nombreCategoría;
    }
     

    /**
     * Get the value of idCate
     *
     * @return the value of idCate
     */
    public int getIdCate() {
        return idCate;
    }

    /**
     * Set the value of idCate
     *
     * @param idCate new value of idCate
     */
    public void setIdCate(int idCate) {
        this.idCate = idCate;
    }    

    public String getNombreCategoría() {
        return nombreCategoría;
    }

    public void setNombreCategoría(String nombreCategoría) {
        this.nombreCategoría = nombreCategoría;
    }
    
    @Override
    public String toString() {
        return "Categorias{" + "idCate=" + idCate + ", nombreCategor\u00eda=" + nombreCategoría + '}';
    }

    public LinkedList<Categorias> buscarCategorias(String sql) {
        
     ResultSet rs = null;
        LinkedList<Categorias> lc = new LinkedList<>();
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
                 
                    lc.add(new Categorias(idc, nombreCategorias));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
        
    }

    public void insertarCategoria(String sql) {
      
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
