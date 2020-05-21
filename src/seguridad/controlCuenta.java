/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

import java.util.LinkedList;

import seguridad.Cuentas;


/**
 *
 * @author Bolaños Aldana
 */
public class controlCuenta {
    
    
    public void insertarCuenta(String correo,String apodo,String nombre1,String nombre2,String apellido1,
    String apellido2,String direccion,String contrasena,String metodoPago,String fechaNacimiento){
       
        String sql="call weirdthings.insertarcuenta('"+correo+"','"+apodo+"','"+nombre1+"','"+nombre2+"','"+apellido1+"',"
                + "','"+apellido2+"','"+direccion+"','"+contrasena+"','"+metodoPago+"','"+fechaNacimiento+"');";
        Cuentas objc=new Cuentas();
        objc.insertarCuenta(sql);
       
     }
}
