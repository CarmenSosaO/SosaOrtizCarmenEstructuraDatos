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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        int result = performExpression(expression);
    }

    private static Integer performExpression(String expression) {
        Stack operands = new Stack();
        Stack operators = new Stack();
        Stack parenthesis = new Stack();
        Integer operand1;
        Integer operand2;
        Integer partialResult;
        Integer result;
        for(int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            switch (ch) {
                case '(':
                    parenthesis.add(ch);
                    break;
                case ')':
                    parenthesis.add(ch);
                    break;
                case '+':
                case '*':
                case '/':
                case '-':
                    operators.add(ch);
                    break;
                case ')':
                   operand1 = (Integer) operands.pop();
                   operand2 = (Integer) operands.pop();
                   result = perfomrOperation(operand1, operand2, (Character) operators.pop());
                   operands.add(result);
                default:
                    operands.add(Integer.parseInt(ch));
            }
        }
        return (Integer) operands.pop();
    }
    
    private static Integer perfomrOperation(Integer op1, Integer op2, Character operator){
        switch (operator) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
