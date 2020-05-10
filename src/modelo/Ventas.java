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
       
    public LinkedList<Ventas> buscarVentas(String sql) {
       
        ResultSet rs = null;
        LinkedList<Ventas> lv = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
    int IDinventario2=0;
    int valorTotal2=0;
    Date FechaVenta2;
    String correoCuentaf2="";

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IDinventario2 = rs.getInt("IDinventario");
                    valorTotal2 = rs.getInt("valorTotal");
                    FechaVenta2 = rs.getDate("FechaVenta");
                     correoCuentaf2 = rs.getString("correoCuentaf");
                   
                    lv.add(new Ventas(IDinventario2, valorTotal2, FechaVenta2, correoCuentaf2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lv;
        
    }
    
}
