/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaprioridad;

/**
 *
 * @author carme
 */
public class ListaPrioridad {

    public static void main(String[] args) {
     ColaADT Cola = new ColaADT(6);
        Cola.enqueue(4, "Maestre");
        Cola.enqueue(2, "Niños");
        Cola.enqueue(4, "Mecánico");
        Cola.enqueue(3, "Hombres");
        Cola.enqueue(4, "Vigía");
        Cola.enqueue(5, "Capitán");
        Cola.enqueue(4, "Timonel");
        Cola.enqueue(3, "Mujeres");
        Cola.enqueue(2, "3ra Edad");
        Cola.enqueue(1, "Niñas");
        Cola.nombrar();    }
}
