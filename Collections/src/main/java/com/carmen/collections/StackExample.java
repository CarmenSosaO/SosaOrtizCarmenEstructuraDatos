/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carmen.collections;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author carme
 */
public class StackExample {
    public static double evaluate(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);
            try {
                Double operand = Double.parseDouble(String.valueOf(character));
                operands.push(operand);
                continue;
            } catch (NumberFormatException exception) {
                //do nothing
            }
            switch (character) {
                // si es cualquier operador, se ingresa a la pila
                case '+' :
                case '-' :
                case '*' :
                case '/' :
                    operators.push(character);
                    break;
                case '(' :
                    break;
                case ')' :
                    double operand2 = operands.pop();
                    double operand1 = operands.pop();
                    Character operator = operators.pop();
                    switch (operator) {
                        case '+' :
                            operands.push(operand1 + operand2);
                            break;
                        case '-' :
                            operands.push(operand1 - operand2);
                            break;
                        case '*' :
                            operands.push(operand1 * operand2);
                            break;
                        case '/' :
                            operands.push(operand1 / operand2);
                            break;
                    }
            }
        }
        // se regresa el ultimo operando, el cual tiene el resultado final
        return operands.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la expresion a evaluar:");
        String inputStr = scanner.nextLine();
        scanner.close();
        System.out.println("Resultado: " + evaluate(inputStr));
    }
}
