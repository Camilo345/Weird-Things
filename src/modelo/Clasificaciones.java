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
public class Clasificaciones {
    private int IDCate;
    private String nombreCategoria; 

    public Clasificaciones() {
    }

    public Clasificaciones(int IDCate, String nombreCategoria) {
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

    public LinkedList<Clasificaciones> buscarclasificacion(String sql) {
        
     ResultSet rs = null;
        LinkedList<Clasificaciones> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idc;
        String nombreClasificacion;
     
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("IDCate");
                    nombreClasificacion = rs.getNString("nombre1");
                 
                    lc.add(new Clasificaciones(idc, nombreClasificacion));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
        
    }
    
    
}
