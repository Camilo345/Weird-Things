/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

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
    
    
    
}
