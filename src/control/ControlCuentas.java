/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cuentas;

/**
 *
 * @author usuario
 */
public class ControlCuentas {
    
        public boolean insertarC(LinkedList<Cuentas> listaC) {
        boolean t = false;
        String sql = "";
        Cuentas objca = new Cuentas();
        for (int i = 0; i < listaC.size(); i++) {

            sql = "insert into usuarios(cuentaCorreo, apodoCuenta, nombre1, nombre2, apellidoC1, apellido2, contraseñaCuenta,direccionCuenta,metodoDePago,fechaNacimiento) "
                    + "value('" + listaC.get(i).getCorreoCuenta() + "', '" + listaC.get(i).getNombre1() + "', '" + listaC.get(i).getNombre2() + "', '"
                    + listaC.get(i).getApellido1() + "', '" + listaC.get(i).getApellido2() + "', '" + listaC.get(i).getApodoCuenta() + "', '" 
                    + listaC.get(i).getContraseñaCuenta()+ "', '" + listaC.get(i).getDireccionCuenta()+ "', '" + listaC.get(i).getMetodoDePago()+ "', '" + listaC.get(i).getFechaNacimiento() + "');";
            t = objca.insert(sql);

        }

        return t;
    }
    
        public HashMap<Integer, String> validarAccesoN() {

        HashMap<Integer, String> us = new HashMap<>();

        String sql = "select correoCuenta, apodoCuenta from cuentas where apodoCuenta= ?";
        Cuentas objC = new Cuentas();
        us = objC.ejecutarSQLSelect(sql);
        return us;
    }

    public HashMap<Integer, String> validarAccesoC() {

        HashMap<Integer, String> ct = new HashMap<>();

        String sql = "select correoCuenta, contraseñaCuenta from cuentas where contraseñaCuenta=?";
        Cuentas objC = new Cuentas();
        ct = objC.ejecutarSQLSelectC(sql);
        return ct;
    }
     public HashMap<Integer, String> consultarUsuario() {

        HashMap<Integer, String> be = new HashMap<>();
        String sql = "select correoCuenta, apodoCuenta from cuentas;";
        Cuentas objbe = new Cuentas();
        be = objbe.ejecutarSQLSelect(sql);

        return be;

    }
     
     public Boolean ObtenerC(String nombrc, String pass) {

        String sql = "select apodoCuenta, contraseñaCuenta from cuentas where apodoCuenta='" + nombrc + "' and contraseñaCuenta='" + pass + "';";
        Cuentas c = new Cuentas();
        boolean b = false;
        String nomc="";
        String pas="";
        ResultSet rs = c.obtenerC(sql);

        try {
            if (rs != null) {
                while (rs.next()) {
                    nomc = rs.getString("apodoCuenta");
                    pas = rs.getString("contraseñaCuenta");

                    if(nomc.equals(nombrc) && pas.equals(pass)){
                        b=true;
                    }else{
                        b=false;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;

    }
}
