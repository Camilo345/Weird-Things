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
public class SubCategorias {
    
    private int idSubCate;
    private String nombreSubCategoria;
    private String nombreCategoriaF;

    
    public SubCategorias() {
    }  

    public SubCategorias(int idSubCate, String nombreSubCategoria, String nombreCategoriaF) {
        this.idSubCate = idSubCate;
        this.nombreSubCategoria = nombreSubCategoria;
        this.nombreCategoriaF = nombreCategoriaF;
    }

    /**
     * Get the value of idSubCate
     *
     * @return the value of idSubCate
     */
    public int getIdSubCate() {
        return idSubCate;
    }

    /**
     * Set the value of idSubCate
     *
     * @param idSubCate new value of idSubCate
     */
    public void setIdSubCate(int idSubCate) {
        this.idSubCate = idSubCate;
    }
    
    /**
     * Get the value of nombreCategoriaF
     *
     * @return the value of nombreCategoriaF
     */
    public String getNombreCategoriaF() {
        return nombreCategoriaF;
    }

    /**
     * Set the value of nombreCategoriaF
     *
     * @param nombreCategoriaF new value of nombreCategoriaF
     */
    public void setNombreCategoriaF(String nombreCategoriaF) {
        this.nombreCategoriaF = nombreCategoriaF;
    }

    

    /**
     * Get the value of nombreSubCategoria
     *
     * @return the value of nombreSubCategoria
     */
    public String getNombreSubCategoria() {
        return nombreSubCategoria;
    }

    /**
     * Set the value of nombreSubCategoria
     *
     * @param nombreSubCategoria new value of nombreSubCategoria
     */
    public void setNombreSubCategoria(String nombreSubCategoria) {
        this.nombreSubCategoria = nombreSubCategoria;
    }

    @Override
    public String toString() {
        return "SubCategorias{" + "idSubCate=" + idSubCate + ", nombreSubCategoria=" + nombreSubCategoria + ", nombreCategoriaF=" + nombreCategoriaF + '}';
    }
    
}
