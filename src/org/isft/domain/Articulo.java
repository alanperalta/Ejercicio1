/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isft.domain;

/**
 *
 * @author loconnell
 */

public class Articulo {
    private int nroInterno;
    private Sucursal sucursal;

    /**
     * @return the nroInterno
     */
    public int getNroInterno() {
        return nroInterno;
    }

    /**
     * @param nroInterno the nroInterno to set
     */
    public void setNroInterno(int nroInterno) {
        this.nroInterno = nroInterno;
    }

    /**
     * @return the sucursal
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
