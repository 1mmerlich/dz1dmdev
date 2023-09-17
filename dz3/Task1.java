package com.dmdev.cs.dz3;
/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 *
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, -6, 3, 2, -9, 0, -123};

        int[] positiveNumbers = removeNegativeElements(numbers);
        int[] multipliedNumbers = multiplyByLength(positiveNumbers);

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Positive numbers: " + Arrays.toString(positiveNumbers));
        System.out.println("Multiplied numbers: " + Arrays.toString(multipliedNumbers));
    }

    public static int[] removeNegativeElements(int[] numbers) {
        int positiveCount = 0;
        for (int number : numbers) {
            if (number >= 0) {
                positiveCount++;
            }
        }

        int[] positiveNumbers = new int[positiveCount];
        int index = 0;
        for (int number : numbers) {
            if (number >= 0) {
                positiveNumbers[index] = number;
                index++;
            }
        }

        return positiveNumbers;
    }

    public static int[] multiplyByLength(int[] numbers) {
        int[] multipliedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            multipliedNumbers[i] = numbers[i] * numbers.length;
        }
        return multipliedNumbers;
    }
}
