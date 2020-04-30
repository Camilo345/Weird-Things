/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author feli_
 */
public class Administradores {

    private int idAdmin;
    private String usuarioAdmin;
    private String contraseñaAdmin;
    private String nombreAd1;
    private String nombreAd2;
    private String apellidoAd1;
    private String apellidoAd2;

    public Administradores() {
    }

    public Administradores(int idAdmin, String usuarioAdmin, String contraseñaAdmin, String nombreAd1, String nombreAd2, String apellidoAd1, String apellidoAd2) {
        this.idAdmin = idAdmin;
        this.usuarioAdmin = usuarioAdmin;
        this.contraseñaAdmin = contraseñaAdmin;
        this.nombreAd1 = nombreAd1;
        this.nombreAd2 = nombreAd2;
        this.apellidoAd1 = apellidoAd1;
        this.apellidoAd2 = apellidoAd2;
    }

    
    /**
     * Get the value of idAdmin
     *
     * @return the value of idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * Set the value of idAdmin
     *
     * @param idAdmin new value of idAdmin
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    
    /**
     * Get the value of apellidoAd2
     *
     * @return the value of apellidoAd2
     */
    public String getApellidoAd2() {
        return apellidoAd2;
    }

    /**
     * Set the value of apellidoAd2
     *
     * @param apellidoAd2 new value of apellidoAd2
     */
    public void setApellidoAd2(String apellidoAd2) {
        this.apellidoAd2 = apellidoAd2;
    }


    /**
     * Get the value of apellidoAd1
     *
     * @return the value of apellidoAd1
     */
    public String getApellidoAd1() {
        return apellidoAd1;
    }

    /**
     * Set the value of apellidoAd1
     *
     * @param apellidoAd1 new value of apellidoAd1
     */
    public void setApellidoAd1(String apellidoAd1) {
        this.apellidoAd1 = apellidoAd1;
    }


    /**
     * Get the value of stringnombreAd2
     *
     * @return the value of stringnombreAd2
     */
    public String getStringnombreAd2() {
        return nombreAd2;
    }

    /**
     * Set the value of stringnombreAd2
     *
     * @param nombreAd2 new value of stringnombreAd2
     */
    public void setStringnombreAd2(String nombreAd2) {
        this.nombreAd2 = nombreAd2;
    }


    /**
     * Get the value of nombreAd1
     *
     * @return the value of nombreAd1
     */
    public String getNombreAd1() {
        return nombreAd1;
    }

    /**
     * Set the value of nombreAd1
     *
     * @param nombreAd1 new value of nombreAd1
     */
    public void setNombreAd1(String nombreAd1) {
        this.nombreAd1 = nombreAd1;
    }


    /**
     * Get the value of contraseñaAdmin
     *
     * @return the value of contraseñaAdmin
     */
    public String getContraseñaAdmin() {
        return contraseñaAdmin;
    }

    /**
     * Set the value of contraseñaAdmin
     *
     * @param contraseñaAdmin new value of contraseñaAdmin
     */
    public void setContraseñaAdmin(String contraseñaAdmin) {
        this.contraseñaAdmin = contraseñaAdmin;
    }


    /**
     * Get the value of usuarioAdmin
     *
     * @return the value of usuarioAdmin
     */
    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    /**
     * Set the value of usuarioAdmin
     *
     * @param usuarioAdmin new value of usuarioAdmin
     */
    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    @Override
    public String toString() {
        return "Administradores{" + "idAdmin=" + idAdmin + ", usuarioAdmin=" + usuarioAdmin + ", contrase\u00f1aAdmin=" + contraseñaAdmin + ", nombreAd1=" + nombreAd1 + ", nombreAd2=" + nombreAd2 + ", apellidoAd1=" + apellidoAd1 + ", apellidoAd2=" + apellidoAd2 + '}';
    }

}
