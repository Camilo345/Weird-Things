/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Bolaños Aldana
 */
public class DetallesVenta {
    
    int IDdetalleVenta;
    Date fechaPago;
    Date fechaEntrega;
    String cantidadProductos;
    int IDProductof3;
    int IDinventariof;

    public DetallesVenta() {
    }

    public DetallesVenta(int IDdetalleVenta, Date fechaPago, Date fechaEntrega, String cantidadProductos, int IDProductof3, int IDinventariof) {
        this.IDdetalleVenta = IDdetalleVenta;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.cantidadProductos = cantidadProductos;
        this.IDProductof3 = IDProductof3;
        this.IDinventariof = IDinventariof;
    }

    
    
    public int getIDdetalleVenta() {
        return IDdetalleVenta;
    }

    public void setIDdetalleVenta(int IDdetalleVenta) {
        this.IDdetalleVenta = IDdetalleVenta;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getIDProductof3() {
        return IDProductof3;
    }

    public void setIDProductof3(int IDProductof3) {
        this.IDProductof3 = IDProductof3;
    }

    public int getIDinventariof() {
        return IDinventariof;
    }

    public void setIDinventariof(int IDinventariof) {
        this.IDinventariof = IDinventariof;
    }

    @Override
    public String toString() {
        return "DetallesVenta{" + "IDdetalleVenta=" + IDdetalleVenta + ", fechaPago=" + fechaPago + ", fechaEntrega=" + fechaEntrega + ", cantidadProductos=" + cantidadProductos + ", IDProductof3=" + IDProductof3 + ", IDinventariof=" + IDinventariof + '}';
    }
    
    public LinkedList<DetallesVenta> buscarDetallesVenta(String sql) {
       
        ResultSet rs = null;
        LinkedList<DetallesVenta> ldv = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
     int IDdetalleVenta2=0;
    Date fechaPago2;
    Date fechaEntrega2;
    String cantidadProductos2="";
    int IDProductof32=0;
    int IDinventariof2=0;
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IDdetalleVenta2 = rs.getInt("IDdetalleVenta");
                    fechaPago2 = rs.getDate("fechaPago");
                    fechaEntrega2 = rs.getDate("fechaEntrega");
                    cantidadProductos2 = rs.getString("cantidadProductos");
                    IDProductof32 = rs.getInt("IDProductof3");
                    IDinventariof2 = rs.getInt("IDinventariof");
                   
                 
                   ldv.add(new DetallesVenta(IDdetalleVenta2, fechaPago2, fechaEntrega2, cantidadProductos2, IDProductof32,IDinventariof2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return ldv;
        
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
