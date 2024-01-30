package org.example;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 * 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * 3. если вместо массива пришел null, метод вернет -3
 */

public class Task2 {
    public static void main(String[] args) {

        System.out.println(checkIndex(new int[] {1, 2, 3, 4, 5, 6}, 6, 9));


    }

    public static int checkIndex(int[] arr, int min, int num) {
        if (arr == null) {
            System.out.println("Массив не может быть null.\n");
            return -3;
        }
        else if (arr.length < min) {
            System.out.println("Длина массива меньше заданного минимума.\n");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;
    }

}
