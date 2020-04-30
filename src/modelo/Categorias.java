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
public class Categorias {
    
    private int idCate;

        private String nombreCategoría;

    public Categorias() {
    }

    public Categorias(int idCate, String nombreCategoría) {
        this.idCate = idCate;
        this.nombreCategoría = nombreCategoría;
    }
     

    /**
     * Get the value of idCate
     *
     * @return the value of idCate
     */
    public int getIdCate() {
        return idCate;
    }

    /**
     * Set the value of idCate
     *
     * @param idCate new value of idCate
     */
    public void setIdCate(int idCate) {
        this.idCate = idCate;
    }

    /**
     * Get the value of nombreCategoría
     *
     * @return the value of nombreCategoría
     */
    public String getNombreCategoría() {
        return nombreCategoría;
    }

    /**
     * Set the value of nombreCategoría
     *
     * @param nombreCategoría new value of nombreCategoría
     */
    public void setNombreCategoría(String nombreCategoría) {
        this.nombreCategoría = nombreCategoría;
    }

    @Override
    public String toString() {
        return "Categorias{" + "idCate=" + idCate + ", nombreCategor\u00eda=" + nombreCategoría + '}';
    }
    
}
