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
public class Calificaciones {

    private int IdCalificacion;
    private double Calificacion;

    public Calificaciones() {
    }

    public Calificaciones(int IdCalificacion, double Calificacion) {
        this.IdCalificacion = IdCalificacion;
        this.Calificacion = Calificacion;
    }

    /**
     * Get the value of nombreCalificacion
     *
     * @return the value of nombreCalificacion
     */
    public double getNombreCalificacion() {
        return Calificacion;
    }

    /**
     * Set the value of nombreCalificacion
     *
     * @param Calificacion new value of nombreCalificacion
     */
    public void setNombreCalificacion(double Calificacion) {
        this.Calificacion = Calificacion;
    }


    /**
     * Get the value of IdCalificacion
     *
     * @return the value of IdCalificacion
     */
    public int getIdCalificacion() {
        return IdCalificacion;
    }

    /**
     * Set the value of IdCalificacion
     *
     * @param IdCalificacion new value of IdCalificacion
     */
    public void setIdCalificacion(int IdCalificacion) {
        this.IdCalificacion = IdCalificacion;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "IdCalificacion=" + IdCalificacion + ", Calificacion=" + Calificacion + '}';
    }

     public LinkedList<Calificaciones> buscarCalificaciones(String sql) {
        
     ResultSet rs = null;
        LinkedList<Calificaciones> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idc;
        double Calificacion;
     
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("IdCalificacion");
                    Calificacion = rs.getDouble("nombreCalificacion");
                 
                    lc.add(new Calificaciones(idc, Calificacion));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
     }
}
