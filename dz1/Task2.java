package com.dmdev.cs.dz1;

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        double result = freeOperation(operand1, operand2, operation);
        System.out.println("Результат " + result);

    }

    static public double freeOperation(double operand1, double operand2, char operation) {
        double result = 0.0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        }
        return result;
    }
}




