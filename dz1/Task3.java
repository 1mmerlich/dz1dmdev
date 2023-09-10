package com.dmdev.cs.dz1;

public class Task3 {
    public static void main(String[] args) {
        double square = square1(32, 8);
        double square1 = square2(8, 22);

        if (square1 > square) {
            System.out.println("Первый треугольник больше");
        } else if (square1 == square) {
            System.out.println("Треугольники равны");
        } else if (square1 < square) {
            System.out.println("Второй треугольник больше первого");
        }
    }

    public static double square1(double a, double b) {
        return a * b;
    }

    public static double square2(double a, double b) {
        return a * b;
    }
}
