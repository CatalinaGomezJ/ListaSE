/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

import java.io.Serializable;

/**
 *
 * @author CatalinaGomezJ
 */
public class Nodo implements Serializable{
    private Infante dato;
    private Nodo siguiente;

    public Nodo(Infante dato) {
        this.dato = dato;
    }

    public Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Infante getDato() {
        return dato;
    }

    public void setDato(Infante dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
