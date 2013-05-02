/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isft.domain;

/**
 *
 * @author Alan
 */
public class Fabricante {
    private int idFabricante;
    private String razonSocial;
    private String domicilio;

    /**
     * @return the idFabricante
     */
    public int getIdFabricante() {
        return idFabricante;
    }

    /**
     * @param idFabricante the idFabricante to set
     */
    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
}
