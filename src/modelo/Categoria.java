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
public class Categoria {
    
        private String nombreCategoría;

    public Categoria() {
    }

    public Categoria(String nombreCategoría) {
        this.nombreCategoría = nombreCategoría;
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
        return "categoria{" + "nombreCategor\u00eda=" + nombreCategoría + '}';
    }
    
}
