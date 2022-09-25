/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadobleligada;
 
public class NodoDoble {
    int dato;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    //constructores
    public NodoDoble() {
    }

    public NodoDoble (int valor) {
        this.dato = valor;
    }

    public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
    public String printAll(){
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
    
}
