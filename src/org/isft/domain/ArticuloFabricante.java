/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isft.domain;

/**
 *
 * @author Alan
 */
public class ArticuloFabricante {
    private Articulo articulo;
    private Fabricante fabricante;
    private int nroModelo;
    private float precio;
    private String descripcion;

    /**
     * @return the articulo
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /**
     * @return the fabricante
     */
    public Fabricante getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the nroModelo
     */
    public int getNroModelo() {
        return nroModelo;
    }

    /**
     * @param nroModelo the nroModelo to set
     */
    public void setNroModelo(int nroModelo) {
        this.nroModelo = nroModelo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
