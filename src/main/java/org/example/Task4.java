package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
 * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

public class Task4 {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        checkArray(array);

    }

    public static void checkArray(Integer[] arr) {
        List<Integer> wrongIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                wrongIndexes.add(i);
            }
        }
        if (!wrongIndexes.isEmpty()) {
            System.out.println("В массиве null по индексам: " + wrongIndexes);
        } else {
            System.out.println("В массиве null нет");
        }
    }
}
