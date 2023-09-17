package com.dmdev.cs.dz3;
/**
 * Дан одномерный массив целых чисел.
 *
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 *
 * Пример:
 *
 *                                          [-4, -18]
 *
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 *
 *                                          [1, 9, 3]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {-4, 0, 1, 9, 0, -18, 3};

        int[][] result = splitArray(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Split array: " + Arrays.deepToString(result));
    }

    public static int[][] splitArray(int[] numbers) {
        List<Integer> negativeList = new ArrayList<>();
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();

        for (int number : numbers) {
            if (number < 0) {
                negativeList.add(number);
            } else if (number > 0) {
                positiveList.add(number);
            } else {
                zeroList.add(number);
            }
        }

        int[][] result = new int[3][];
        result[0] = convertListToArray(negativeList);
        result[1] = convertListToArray(positiveList);
        result[2] = convertListToArray(zeroList);

        return result;
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
