/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carmen.collections;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class LinkedListMenu {
    static final String INCORRECT_OPTION_MESSAGE = "Opción incorreta. Vuelva a seleccionar";
    static final String INVALID_ITEM_ERROR_MESSAGE = "Solo se aceptan valores enteros";
    static LinkedList items = new LinkedList();
    
    public static void main(String[] args) {   
        System.out.println("Métodos de Linked List");
        do {
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            System.out.print("Ingrese opción: ");
            int option = scanOption();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println(INCORRECT_OPTION_MESSAGE);
            }
        } while(true);
    }

    private static void exit() {
        System.exit(0);
    }

    private static void add() {
        int option;
        do {
            System.out.println("Agregar");
            show();
            System.out.println("1 Agregar al inicio");
            System.out.println("2 Agregar al final");
            System.out.println("3 Cancelar");
            System.out.println("Elijar opción");
            option = scanOption();
            switch (option) {
                case 1:
                    addFirst();
                    break;
                case 2:
                    addLast();
                    break;
                case 3:
                    return;
                default:
                    System.out.println(INCORRECT_OPTION_MESSAGE);
            }
            System.out.flush();
        } while (true);
    }

    private static void addFirst() {
        System.out.println("Ingrese un dato: ");
        Object itemRead = readItem();
        if(itemRead == null)
            return;
        items.addFirst(itemRead);
    }

    private static void addLast() {
        System.out.println("Ingrese un dato: ");
        Object itemRead = readItem();
        if(itemRead == null)
            return;
        items.addLast(itemRead);
    }
    private static void delete() {
        int option;
        do {
            System.out.println("Eliminar");
            show();
            System.out.println("1 Eliminar primero");
            System.out.println("2 Eliminar ultimo");
            System.out.println("3 Eliminar todo");
            System.out.println("4 Cancelar");
            System.out.println("Elijar opción");
            option = scanOption();
            switch (option) {
                case 1:
                    items.removeFirst();
                    break;
                case 2:
                    items.removeLast();
                    break;
                case 3:
                    removeAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println(INCORRECT_OPTION_MESSAGE);
            }
            System.out.flush();
        } while (true);
    }

    private static void removeAll() {
        items.clear();
    }

    private static void show() {
        System.out.println("Elementos del ArrayList: " + items.toString());
    }
    
    private static Object readItem() {
        try {
            Scanner scanner = new Scanner(System.in);
            Integer itemRead = scanner.nextInt();
            return itemRead;
        }catch(InputMismatchException e) {
            System.out.println(INVALID_ITEM_ERROR_MESSAGE);
            return null;
        }
    }
    
    private static Integer scanOption() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch(InputMismatchException e) {
            return -1;
        }
    }
}