package com.dmdev.cs.dz2;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 *
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        int number = 228910;
        int evenCount = countEvenDigits(number);
        int oddCount = countOddDigits(number);

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
    }

    public static int countEvenDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static int countOddDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
