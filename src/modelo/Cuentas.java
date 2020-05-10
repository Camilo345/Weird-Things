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
 * @author feli_
 */
public class Cuentas {

    private String correoCuenta;
    private String contraseñaCuenta;
    private String apodoCuenta;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccionCuenta;
    private String metodoDePago;
    private Date fechaNacimiento;

    public Cuentas() {
    }

    public Cuentas(String correoCuenta, String contraseñaCuenta, String apodoCuenta, String nombre1, String nombre2, String apellido1, String apellido2, String direccionCuenta, String metodoDePago, Date fechaNacimiento) {
        this.correoCuenta = correoCuenta;
        this.contraseñaCuenta = contraseñaCuenta;
        this.apodoCuenta = apodoCuenta;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccionCuenta = direccionCuenta;
        this.metodoDePago = metodoDePago;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Get the value of metodoDePago
     *
     * @return the value of metodoDePago
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Set the value of metodoDePago
     *
     * @param metodoDePago new value of metodoDePago
     */
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    

    /**
     * Get the value of contraseñaCuenta
     *
     * @return the value of contraseñaCuenta
     */
    public String getContraseñaCuenta() {
        return contraseñaCuenta;
    }

    /**
     * Set the value of contraseñaCuenta
     *
     * @param contraseñaCuenta new value of contraseñaCuenta
     */
    public void setContraseñaCuenta(String contraseñaCuenta) {
        this.contraseñaCuenta = contraseñaCuenta;
    }


    /**
     * Get the value of direccionCuenta
     *
     * @return the value of direccionCuenta
     */
    public String getDireccionCuenta() {
        return direccionCuenta;
    }

    /**
     * Set the value of direccionCuenta
     *
     * @param direccionCuenta new value of direccionCuenta
     */
    public void setDireccionCuenta(String direccionCuenta) {
        this.direccionCuenta = direccionCuenta;
    }


    /**
     * Get the value of apellido2
     *
     * @return the value of apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Set the value of apellido2
     *
     * @param apellido2 new value of apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    /**
     * Get the value of apellido1
     *
     * @return the value of apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Set the value of apellido1
     *
     * @param apellido1 new value of apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    /**
     * Get the value of nombre2
     *
     * @return the value of nombre2
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * Set the value of nombre2
     *
     * @param nombre2 new value of nombre2
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }


    /**
     * Get the value of nombre1
     *
     * @return the value of nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * Set the value of nombre1
     *
     * @param nombre1 new value of nombre1
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }


    /**
     * Get the value of apodoCuenta
     *
     * @return the value of apodoCuenta
     */
    public String getApodoCuenta() {
        return apodoCuenta;
    }

    /**
     * Set the value of apodoCuenta
     *
     * @param apodoCuenta new value of apodoCuenta
     */
    public void setApodoCuenta(String apodoCuenta) {
        this.apodoCuenta = apodoCuenta;
    }


    /**
     * Get the value of correoCuenta
     *
     * @return the value of correoCuenta
     */
    public String getCorreoCuenta() {
        return correoCuenta;
    }

    /**
     * Set the value of correoCuenta
     *
     * @param correoCuenta new value of correoCuenta
     */
    public void setCorreoCuenta(String correoCuenta) {
        this.correoCuenta = correoCuenta;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "correoCuenta=" + correoCuenta + ", contrase\u00f1aCuenta=" + contraseñaCuenta + ", apodoCuenta=" + apodoCuenta + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", direccionCuenta=" + direccionCuenta + ", metodoDePago=" + metodoDePago + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

      public LinkedList<Cuentas> buscarCuentas(String sql) {
       
        ResultSet rs = null;
        LinkedList<Cuentas> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
     String correoCuenta2="";
     String contraseñaCuenta2="";
     String apodoCuenta2="";
     String nombre12="";
     String nombre22="";
     String apellido12="";
     String apellido22="";
     String direccionCuenta2="";
     String metodoDePago2="";
     Date fechaNacimiento2;
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    correoCuenta2 = rs.getString("correoCuenta");
                    contraseñaCuenta2 = rs.getString("contraseñaCuenta");
                    apodoCuenta2 = rs.getString("apodoCuenta");
                    nombre12 = rs.getString("nombre1");
                    try {
                        nombre22 = rs.getString("nombre2");
                    } catch (NullPointerException n) { }
                    if(nombre22==null){
                        nombre22 = "";
                    }
                    
                    apellido12 = rs.getString("apellido1");
                     try {
                        apellido22 = rs.getString("apellido2");
                    } catch (NullPointerException n) { }
                    if(apellido22==null){
                        apellido22 = "";
                    }
                 
                    direccionCuenta2 = rs.getString("direccionCuenta");
                    metodoDePago2 = rs.getString("metodoDePago");
                    fechaNacimiento2 = rs.getDate("fechaNacimiento2");
                    
                    lc.add(new Cuentas(correoCuenta2, contraseñaCuenta2, apodoCuenta2, nombre12, nombre22,apellido12,apellido22,direccionCuenta2,metodoDePago2,fechaNacimiento2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
        
    }
    
    
}
