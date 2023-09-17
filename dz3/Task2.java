package com.dmdev.cs.dz3;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] characters = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

        int[] asciiCodes = convertToAscii(characters);
        printElementsGreaterThanAverage(asciiCodes);
    }

    public static int[] convertToAscii(char[] characters) {
        int[] asciiCodes = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            asciiCodes[i] = (int) characters[i];
        }
        return asciiCodes;
    }

    public static void printElementsGreaterThanAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        System.out.println("Average: " + average);

        System.out.print("Elements greater than average: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
