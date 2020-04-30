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
public class Ventas {
    
    int IDinventario;
    int valorTotal;
    Date FechaVenta;
    String correoCuentaf;

    public Ventas() {
    }

    public Ventas(int IDinventario, int valorTotal, Date FechaVenta, String correoCuentaf) {
        this.IDinventario = IDinventario;
        this.valorTotal = valorTotal;
        this.FechaVenta = FechaVenta;
        this.correoCuentaf = correoCuentaf;
    }

    
    
    public int getIDinventario() {
        return IDinventario;
    }

    public void setIDinventario(int IDinventario) {
        this.IDinventario = IDinventario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getCorreoCuentaf() {
        return correoCuentaf;
    }

    public void setCorreoCuentaf(String correoCuentaf) {
        this.correoCuentaf = correoCuentaf;
    }

    @Override
    public String toString() {
        return "Ventas{" + "IDinventario=" + IDinventario + ", valorTotal=" + valorTotal + ", FechaVenta=" + FechaVenta + ", correoCuentaf=" + correoCuentaf + '}';
    }
       
    
    
}
