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
public class Fotos {
    
        private int idFoto;
        private String imagen;
    private int IDProductoF;


    public Fotos() {
    }

    public Fotos(int idFoto, String imagen, int IDProductoF) {
        this.idFoto = idFoto;
        this.imagen = imagen;
        this.IDProductoF = IDProductoF;
    }
    /**
     * Get the value of idFoto
     *
     * @return the value of idFoto
     */
    public int getIdFoto() {
        return idFoto;
    }

    /**
     * Set the value of idFoto
     *
     * @param idFoto new value of idFoto
     */
    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    /**
     * Get the value of IDProductoF
     *
     * @return the value of IDProductoF
     */
    public int getIDProductoF() {
        return IDProductoF;
    }

    /**
     * Set the value of IDProductoF
     *
     * @param IDProductoF new value of IDProductoF
     */
    public void setIDProductoF(int IDProductoF) {
        this.IDProductoF = IDProductoF;
    }

    /**
     * Get the value of imagen
     *
     * @return the value of imagen
     */
    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Fotos{" + "idFoto=" + idFoto + ", imagen=" + imagen + ", IDProductoF=" + IDProductoF + '}';
    }

    /**
     * Set the value of imagen
     *
     * @param imagen new value of imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
