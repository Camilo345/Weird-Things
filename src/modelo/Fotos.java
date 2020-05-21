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
 * @author feli_
 */
public class Fotos {
        private String imagen;
    private int IDProductoF;


    public Fotos() {
    }

    public Fotos(String imagen, int IDProductoF) {
        this.imagen = imagen;
        this.IDProductoF = IDProductoF;
    }
    /**
     * Get the value of IDProductoF
     *
     * @return the value of IDProductoF
     */
    public int getIDProductoF() {
        return IDProductoF;
    }

    /**
     * Set the value of IDProductoF
     *
     * @param IDProductoF new value of IDProductoF
     */
    public void setIDProductoF(int IDProductoF) {
        this.IDProductoF = IDProductoF;
    }

    /**
     * Get the value of imagen
     *
     * @return the value of imagen
     */
    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Fotos{" + "imagen=" + imagen + ", IDProductoF=" + IDProductoF + '}';
    }

    /**
     * Set the value of imagen
     *
     * @param imagen new value of imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
     public LinkedList<Fotos> buscarFoto(String sql) {
        
     ResultSet rs = null;
        LinkedList<Fotos> lf = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        String imagen2;
        int IDProductoF2;
     
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    imagen2 = rs.getString("imagen");
                    IDProductoF2 = rs.getInt("IDProductoF");
                 
                    lf.add(new Fotos(imagen2, IDProductoF2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lf;
        
    }

    public void EliminarFoto(String sql) {
        
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
