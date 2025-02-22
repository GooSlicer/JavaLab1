package org.example.Tasks;

import java.util.Random;

public class Arrays {
    //заполняет массив
    public int[] fillingRandomArray(int size, int origin, int bound) {
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
    //меняет мин и макс
    public void swapMinMax(int[] arr) {
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
    //суммирует четные элементы
    public void sumEvenElements(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.print("\n");
        System.out.print(sum);
    }
    //заменяет отрицательные числа нулями
    public void replaceNegativeElements(int[] arr) {
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    //находит разницу среднего ариф и минимального элемента
    public void findDifference(int[] arr) {
        int min = arr[0];
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (j < min) {
                min = j;
            }
        }
        System.out.print("\n" + (sum / arr.length - min));
    }
    //метод, который ищет повторяющиеся элементы
    public void similarElementsCount(int[] arr) {
        int count = 0;
        boolean isTheSame = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isTheSame) {
                    if (arr[i] == arr[j] && j < i) {
                        isTheSame = false;
                    }
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " " + count + " раза");
            }
            isTheSame = true;
            count = 0;
        }
    }
}
