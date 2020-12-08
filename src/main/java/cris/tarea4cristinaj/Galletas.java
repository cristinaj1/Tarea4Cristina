/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cris.tarea4cristinaj;

/**
 *
 * @author Cris
 */
public class Galletas {
    public String sabor;
    public int radio;
    public double precio;

    public Galletas() {
    }

    public Galletas(String sabor, int radio, double precio) {
        this.sabor = sabor;
        this.radio = radio;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Galletas{" + "sabor=" + sabor + ", radio=" + radio + ", precio=" + precio + '}';
    }
    
    
    
}
