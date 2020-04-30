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
public class Producto {

    private int IDProdcucto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioProducto;
    private int unidadesProducto;
    private int IDSubcategoriaF;
    private int IdAdminF;
    private int IdCalificacionF;

    public Producto() {
    }

    public Producto(int IDProdcucto, String nombreProducto, String descripcionProducto, double precioProducto, int unidadesProducto, int IDSubcategoriaF, int IdAdminF, int IdCalificacionF) {
        this.IDProdcucto = IDProdcucto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.unidadesProducto = unidadesProducto;
        this.IDSubcategoriaF = IDSubcategoriaF;
        this.IdAdminF = IdAdminF;
        this.IdCalificacionF = IdCalificacionF;
    }
    

    /**
     * Get the value of IdCalificacion
     *
     * @return the value of IdCalificacion
     */
    public int getIdCalificacion() {
        return IdCalificacionF;
    }

    /**
     * Set the value of IdCalificacion
     *
     * @param IdCalificacionF new value of IdCalificacion
     */
    public void setIdCalificacion(int IdCalificacionF) {
        this.IdCalificacionF = IdCalificacionF;
    }


    /**
     * Get the value of IdAdmin
     *
     * @return the value of IdAdmin
     */
    public int getIdAdmin() {
        return IdAdminF;
    }

    /**
     * Set the value of IdAdmin
     *
     * @param IdAdminF new value of IdAdmin
     */
    public void setIdAdmin(int IdAdminF) {
        this.IdAdminF = IdAdminF;
    }


    /**
     * Get the value of IDSubcategoriaF
     *
     * @return the value of IDSubcategoriaF
     */
    public int getIDSubcategoriaF() {
        return IDSubcategoriaF;
    }

    /**
     * Set the value of IDSubcategoriaF
     *
     * @param IDSubcategoriaF new value of IDSubcategoriaF
     */
    public void setIDSubcategoriaF(int IDSubcategoriaF) {
        this.IDSubcategoriaF = IDSubcategoriaF;
    }


    /**
     * Get the value of unidadesProducto
     *
     * @return the value of unidadesProducto
     */
    public int getUnidadesProducto() {
        return unidadesProducto;
    }

    /**
     * Set the value of unidadesProducto
     *
     * @param unidadesProducto new value of unidadesProducto
     */
    public void setUnidadesProducto(int unidadesProducto) {
        this.unidadesProducto = unidadesProducto;
    }


    /**
     * Get the value of precioProducto
     *
     * @return the value of precioProducto
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * Set the value of precioProducto
     *
     * @param precioProducto new value of precioProducto
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


    /**
     * Get the value of descripcionProducto
     *
     * @return the value of descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Set the value of descripcionProducto
     *
     * @param descripcionProducto new value of descripcionProducto
     */
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    /**
     * Get the value of IDProdcucto
     *
     * @return the value of IDProdcucto
     */
    public int getIDProdcucto() {
        return IDProdcucto;
    }

    /**
     * Set the value of IDProdcucto
     *
     * @param IDProdcucto new value of IDProdcucto
     */
    public void setIDProdcucto(int IDProdcucto) {
        this.IDProdcucto = IDProdcucto;
    }

    @Override
    public String toString() {
        return "Producto{" + "IDProdcucto=" + IDProdcucto + ", nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto + ", precioProducto=" + precioProducto + ", unidadesProducto=" + unidadesProducto + ", IDSubcategoriaF=" + IDSubcategoriaF + ", IdAdminF=" + IdAdminF + ", IdCalificacionF=" + IdCalificacionF + '}';
    }

    
}
