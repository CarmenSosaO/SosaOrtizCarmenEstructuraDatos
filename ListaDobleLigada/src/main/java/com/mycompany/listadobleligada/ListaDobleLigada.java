/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listadobleligada;


public class ListaDobleLigada {

    public static void main(String[] args) {
        NodoDoble head = new NodoDoble(10);
        System.out.println( head );
        NodoDoble nuevo =new NodoDoble(4,null, head);
        head.setSiguiente(nuevo);
        System.out.println( head.getSiguiente() );
    }
}
