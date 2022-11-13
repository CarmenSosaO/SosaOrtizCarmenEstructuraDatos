

package com.mycompany.listacola;

public class ClasePrincipal {

    public static void main(String[] args) {
        Cola cola= new Cola();
        cola.Enqueue(9);
        cola.Enqueue(7);
        cola.Enqueue(10);
        System.out.println(cola.toString());
        
        

    }
}
