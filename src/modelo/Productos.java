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
public class Productos {
    
    private int IdProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioProducto;
    private int unidadesProducto;
    private int IDSubcategoriaF;
    private int IdAdminF;
    private int IdCalificacionF;

    public Productos() {
    }

    public Productos(int IdProducto, String nombreProducto, String descripcionProducto, double precioProducto, int unidadesProducto, int IDSubcategoriaF, int IdAdminF, int IdCalificacionF) {
        this.IdProducto = IdProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.unidadesProducto = unidadesProducto;
        this.IDSubcategoriaF = IDSubcategoriaF;
        this.IdAdminF = IdAdminF;
        this.IdCalificacionF = IdCalificacionF;
    }

    /**
     * Get the value of IdProductos
     *
     * @return the value of IdProductos
     */
    public int getIdProducto() {
        return IdProducto;
    }

    /**
     * Set the value of IdProductos
     *
     * @param IdProducto new value of IdProductos
     */
    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    /**
     * Get the value of IdCalificacion
     *
     * @return the value of IdCalificacion
     */
    public int getIdCalificacion() {
        return IdCalificacionF;
    }

    /**
     * Set the value of IdCalificacion
     *
     * @param IdCalificacionF new value of IdCalificacion
     */
    public void setIdCalificacion(int IdCalificacionF) {
        this.IdCalificacionF = IdCalificacionF;
    }


    /**
     * Get the value of IdAdmin
     *
     * @return the value of IdAdmin
     */
    public int getIdAdmin() {
        return IdAdminF;
    }

    /**
     * Set the value of IdAdmin
     *
     * @param IdAdminF new value of IdAdmin
     */
    public void setIdAdmin(int IdAdminF) {
        this.IdAdminF = IdAdminF;
    }


    /**
     * Get the value of IDSubcategoriaF
     *
     * @return the value of IDSubcategoriaF
     */
    public int getIDSubcategoriaF() {
        return IDSubcategoriaF;
    }

    /**
     * Set the value of IDSubcategoriaF
     *
     * @param IDSubcategoriaF new value of IDSubcategoriaF
     */
    public void setIDSubcategoriaF(int IDSubcategoriaF) {
        this.IDSubcategoriaF = IDSubcategoriaF;
    }


    /**
     * Get the value of unidadesProducto
     *
     * @return the value of unidadesProducto
     */
    public int getUnidadesProducto() {
        return unidadesProducto;
    }

    /**
     * Set the value of unidadesProducto
     *
     * @param unidadesProducto new value of unidadesProducto
     */
    public void setUnidadesProducto(int unidadesProducto) {
        this.unidadesProducto = unidadesProducto;
    }


    /**
     * Get the value of precioProducto
     *
     * @return the value of precioProducto
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * Set the value of precioProducto
     *
     * @param precioProducto new value of precioProducto
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


    /**
     * Get the value of descripcionProducto
     *
     * @return the value of descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Set the value of descripcionProducto
     *
     * @param descripcionProducto new value of descripcionProducto
     */
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Productos{" + "IdProducto=" + IdProducto + ", nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto + ", precioProducto=" + precioProducto + ", unidadesProducto=" + unidadesProducto + ", IDSubcategoriaF=" + IDSubcategoriaF + ", IdAdminF=" + IdAdminF + ", IdCalificacionF=" + IdCalificacionF + '}';
    }

      public LinkedList<Productos> buscarProducto(String sql) {
       
        ResultSet rs = null;
        LinkedList<Productos> lp = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
     int IDProdcucto2=0;
     String nombreProducto2="";
     String descripcionProducto2="";
     double precioProducto2=0;
     int unidadesProducto2=0;
     int IDSubcategoriaF2=0;
     int IdAdminF2=0;
     int IdCalificacionF2=0;
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IDProdcucto2 = rs.getInt("IDProdcucto");
                    nombreProducto2 = rs.getString("nombreProducto");
                    descripcionProducto2 = rs.getString("descripcionProducto");
                    precioProducto2 = rs.getDouble("precioProducto");
                    unidadesProducto2 = rs.getInt("unidadesProducto");
                    IDSubcategoriaF2 = rs.getInt("IDSubcategoriaF");
                    IdAdminF2 = rs.getInt("IdAdminF");
                    IdCalificacionF2 = rs.getInt("IdCalificacionF");
                  
                 
                    lp.add(new Productos(IDProdcucto2, nombreProducto2, descripcionProducto2, precioProducto2,
                                        unidadesProducto2,IDSubcategoriaF2,IdAdminF2,IdCalificacionF2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lp;
        
    }

    public void insertarProducto(String sql) {
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

    public void EliminarProducto(String sql) {
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
