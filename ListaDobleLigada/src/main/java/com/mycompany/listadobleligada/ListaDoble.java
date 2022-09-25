/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadobleligada;


public class ListaDoble {
    private NodoDoble inicio, fin;
    public ListaDoble (){
        inicio=fin=null;
    }
    //mérotod para identifcar cuanod la lista esta vacia
    public boolean estaVacia(){
        return inicio ==null;
    }
    //metodo para agregar nodos al final
    public void agregarAlFinal (int dato){
        if(!estaVacia()){
            fin=new NodoDoble(dato, null, fin);
            fin.anterior.siguiente=fin;
            
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    //metodo para agregar al inicio
        public void agregarAlInicio (int dato){
        if(!estaVacia()){
            inicio=new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior=inicio;
            
        }else{
            inicio=fin=new NodoDoble(dato);
        }
        }
        //Metodo para mostrar la lista de inicio a fin
        public void mostrarInicioFin(){
            if(!estaVacia()){
                String datos ="<=>";
                NodoDoble aux=inicio;
                while(aux!=null){
                    System.out.print(aux);
                    datos = datos + "["+aux.dato+"]<=>";
                    aux=aux.siguiente;
                }
                
            }
        }
        //mostar de fin a inicio
                public void mostrarFinInicio(){
            if(!estaVacia()){
                String datos ="<=>";
                NodoDoble aux=fin;
                while(aux!=null){
                    System.out.print(aux);
                    datos = datos + "["+aux.dato+"]<=>";
                    aux=aux.anterior;
                }
                
            }
        }
    }


