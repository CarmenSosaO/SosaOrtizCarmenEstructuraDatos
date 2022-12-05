/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.carmen.collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class ArrayListMenu {
    static final String INCORRECT_OPTION_MESSAGE = "Opción incorreta. Vuelva a seleccionar";
    static final String INVALID_INDEX_ERROR_MESSAGE = "El valor ingresado esta fuera del rango del índice";
    static final String INVALID_ITEM_ERROR_MESSAGE = "Solo se aceptan valores enteros";
    static ArrayList items = new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {   
        System.out.println("Métodos de Array List");
        do {
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            System.out.print("Ingrese opción: ");
            readOption();
            System.out.flush();
        } while(true);
    }

    private static void readOption() {
        int option = scannOption();
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
            default:
                System.out.println(INCORRECT_OPTION_MESSAGE);
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void add() {
        System.out.println("Ingrese un dato: ");
        Object itemRead = readItem();
        if(itemRead == null)
            return;
        items.add(itemRead);
    }

    private static void delete() {
        int option;
        do {
            System.out.println("Eliminar");
            show();
            System.out.println("1 Eliminar objeto");
            System.out.println("2 Eliminar por índice");
            System.out.println("3 Eliminar todo");
            System.out.println("4 Cancelar");
            System.out.println("Elijar opción");
            option = scannOption();
            switch (option) {
                case 1 -> removeObject();
                case 2 -> removeByIndex();
                case 3 -> removeAll();
                case 4 -> {
                    return;
                }
                default -> System.out.println(INCORRECT_OPTION_MESSAGE);
            }
            System.out.flush();
        } while (true);
    }

    private static void removeObject() {
        System.out.println("Indique el objeto a eliminar: ");
        Object itemRead = readItem();
        if(itemRead == null)
            return;
        if(items.remove(readItem())){
            System.out.println("Objecto eliminado exitosamente");
        } else {
            System.out.println("Objeto no encontrado");
        }   
    }

    private static void removeByIndex() {
        System.out.println("Indique el índice del objeto a eliminar: ");
        int indexToDelete = scanner.nextInt();
        try {
            System.out.println("Objeto " + items.remove(indexToDelete) + " eliminado exitosamente");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(INVALID_INDEX_ERROR_MESSAGE);
        }
    }

    private static void removeAll() {
        items.clear();
    }

    private static void show() {
        System.out.println("Elementos del ArrayList: " + items.toString());
    }
    
    private static Object readItem() {
        
        try {
            Integer itemRead = scanner.nextInt();
            return itemRead;
        }catch(InputMismatchException e) {
            System.out.println(INVALID_ITEM_ERROR_MESSAGE);
            return null;
        }
    }
    
    private static Integer scannOption() {
        try {
            return scanner.nextInt();
        }catch(InputMismatchException e) {
            return -1;
        }
    }
}