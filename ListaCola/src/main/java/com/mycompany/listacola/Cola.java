package com.mycompany.listacola;

public class Cola {

    private Nodo inicioCola, finalCola;
    String Cola = "";

   
    public Cola(Nodo inicioCola, Nodo finalCola) {
        this.inicioCola = inicioCola;
        this.finalCola = finalCola;
    }

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }

    public boolean estaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.dato = dato;
        nuevo_nodo.siguiente = null;

        if (estaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;

        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    public int Dequeue(){
        if (!estaVacia()) {
            int dato = inicioCola.dato;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
                
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return dato;
            
        } else {
            return 0;
        }
        
                
    }
 public Nodo getInicioCola() {
        return inicioCola;
    }

    public void setInicioCola(Nodo inicioCola) {
        this.inicioCola = inicioCola;
    }

    public Nodo getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(Nodo finalCola) {
        this.finalCola = finalCola;
    }

    public String getCola() {
        return Cola;
    }

    public void setCola(String Cola) {
        this.Cola = Cola;
    }

    @Override
    public String toString() {
        return "Cola{" + "inicioCola=" + inicioCola + ", finalCola=" + finalCola + ", Cola=" + Cola + '}';
    }
    
    
}
