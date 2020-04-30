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
public class Foto {
    
        private String imagen;
    private int IDProductoF;

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


    public Foto() {
    }

    public Foto(String imagen, int IDProductoF) {
        this.imagen = imagen;
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

    /**
     * Set the value of imagen
     *
     * @param imagen new value of imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", IDProductoF=" + IDProductoF + '}';
    }
    
}
