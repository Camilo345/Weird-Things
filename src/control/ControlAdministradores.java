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
import modelo.Administrador;
import modelo.Categorias;

/**
 *
 * @author Bolaños Aldana
 */
public class ControlAdministradores {
    
      public LinkedList<Administrador> consultarAdministradores() {
        String sql="Select * from Administradores;";
        Administrador objc=new Administrador();
        LinkedList<Administrador> listc=objc.buscarAdministradores(sql);
        
        return listc;
    }
      
    public HashMap<Integer, String> validarAccesoN() {

        HashMap<Integer, String> us = new HashMap<>();

        String sql = "select idAdmin, usuarioAdmin from cuentas where apodoCuenta= ?";
        Administrador objC = new Administrador();
        us = objC.ejecutarSQLSelect(sql);
        return us;
    }
    
    public HashMap<Integer, String> validarAccesoC() {

        HashMap<Integer, String> ct = new HashMap<>();

        String sql = "select idAdmin, contraseñaAdmin from cuentas where contraseñaAdmin=?";
        Administrador objC = new Administrador();
        ct = objC.ejecutarSQLSelectC(sql);
        return ct;
    }
    
    public HashMap<Integer, String> consultarUsuario() {

        HashMap<Integer, String> be = new HashMap<>();
        String sql = "select idAdmin, usuarioAdmin from cuentas;";
        Administrador objbe = new Administrador();
        be = objbe.ejecutarSQLSelect(sql);

        return be;

    }
    
    public Boolean ObtenerC(String nombrA, String pass) {

        String sql = "select usuarioAdmin, contraseñaAdmin from cuentas where usuarioAdmin='" + nombrA + "';";
        Administrador a = new Administrador();
        boolean b = false;
        String nomc="";
        String pas="";
        ResultSet rs = a.obtenerA(sql);

        try {
            if (rs != null) {
                while (rs.next()) {
                    nomc = rs.getString("apodoCuenta");
                    pas = rs.getNString("contraseñaAdmin");

                    if(nomc.equals(nombrA) && pas.equals(pass)){
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
    
      public void insertarAdministrador(String usuario,String contrasena ,String nombre1,String nombre2,String apellido1,
    String apellido2){
       
        String sql="call weirdthings.insertarcuenta('"+usuario+"','"+contrasena+"','"+nombre1+"','"+nombre2+"','"+apellido1+"',"
                + "','"+apellido2+"');";
        Administrador objc=new Administrador();
        objc.InsertarAdministrador(sql);
       
     }
}
