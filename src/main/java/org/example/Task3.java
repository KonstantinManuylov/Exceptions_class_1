package org.example;

import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может
 * лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Task3 {

    static int[][] ints = new int[][]{
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1}
    };

    public static void main(String[] args) {
        System.out.println(findSum(ints));

    }

    public static int findSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                throw new RuntimeException("Массив - не матрица");
            }
            for (int j = 0; j < arr.length; j++) {
                int el = arr[i][j];
                if (el != 0 && el != 1){
                    System.out.println(sum);
                    throw new RuntimeException("Значения должны быть 0 или 1");
                }
                sum += el;
            }
        }
        return sum;
    }

}
