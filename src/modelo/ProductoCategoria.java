/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bolaños Aldana
 */
public class ProductoCategoria {
    
    int IDCatePG;
    int IDProductof2;
    int IDCateef;

    public ProductoCategoria() {
    }

    public ProductoCategoria(int IDCatePG, int IDProductof2, int IDCateef) {
        this.IDCatePG = IDCatePG;
        this.IDProductof2 = IDProductof2;
        this.IDCateef = IDCateef;
    }

    public int getIDCatePG() {
        return IDCatePG;
    }

    public void setIDCatePG(int IDCatePG) {
        this.IDCatePG = IDCatePG;
    }

    public int getIDProductof2() {
        return IDProductof2;
    }

    public void setIDProductof2(int IDProductof2) {
        this.IDProductof2 = IDProductof2;
    }

    public int getIDCateef() {
        return IDCateef;
    }

    public void setIDCateef(int IDCateef) {
        this.IDCateef = IDCateef;
    }

    @Override
    public String toString() {
        return "ProductoCategoria{" + "IDCatePG=" + IDCatePG + ", IDProductof2=" + IDProductof2 + ", IDCateef=" + IDCateef + '}';
    }
    
    
    
}
