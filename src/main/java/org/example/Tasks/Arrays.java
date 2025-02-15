package org.example.Tasks;

import java.util.Random;

public class Arrays {
    public int[] fillingRandomArray(int size, int origin, int bound) { //заполняет массив
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(origin, bound);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
        return array;
    }

    public void swapMinMax(int[] arr) { //меняет мин и макс
        int minIdx = 0;
        int maxIdx = 0;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        temp = arr[minIdx];
        arr[minIdx] = arr[maxIdx];
        arr[maxIdx] = temp;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public void sumEvenElements(int[] arr) { //суммирует четные элементы
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.print("\n");
        System.out.print(sum);
    }

    public void replaceNegativeElements(int[] arr) { //заменяет отрицательные числа нулями
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public void findDifference(int[] arr) { //находит разницу среднего ариф и минимального элемента
        int avg;
        int result;
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        result = avg - min;
        System.out.print("\n");
        System.out.print(result);
    }

    public void similarElementsCount(int[] arr) { //метод, который ищет повторяющиеся элементы
        System.out.print("\n");
        int size = arr.length;
        int index = 0;
        int[][] result = new int[size][2];
        boolean isNew;
        for (int value : arr) {
            isNew = true;
            for (int i = 0; i < index; i++) {
                if (result[i][0] == value) {
                    result[i][1]++;
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                result[index][0] = value;
                result[index][1] = 1;
                index++;
            }
        }
        for (int[] item : result) {
            if (item[1] > 1) {
                System.out.printf("Число: %d \tКоличество повторений: %d\n", item[0], item[1]);
            }
        }
    }
}
