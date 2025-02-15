package org.example;
import java.util.Random;

public class Arrays
{
    public int[] FillingRandomArray() {
        Random random = new Random();
        int size = 20;
        int[] array = new int[size];
        int origin = -10;
        int bound = 10;

        int i;
        for (i = 0; i < size; i++) {
            array[i] = random.nextInt(origin, bound);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
        return array;
    }
    public void swapMinMax(int[] arr){
        int minIdx = 0, maxIdx = 0, min = arr[0], max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min < arr[i]){
                min = arr[i];
                maxIdx = i;
            }else if(max > arr[i]){
                max = arr[i];
                minIdx = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i == minIdx){
                arr[i] = min;
            }else if(i == maxIdx){
                arr[i] = max;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public void SumEvenElements (int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum += arr[i];
        }
        System.out.print("\n");
        System.out.print(sum);
    }
    public void ReplaceNegativeElements (int[] arr){
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public void FindDifference (int[] arr){
        int sum = 0;
        int mean = 0;
        int min = arr[0];
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        mean = sum/ arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        result = mean - min;
        System.out.print("\n");
        System.out.print(result);
    }
    private boolean isContain(int[] arr, int value, int pos) {
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }
    private int getDistinctLength(int[] arr) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isContain(arr, arr[i], i + 1)) len++;
        }
        return len;
    }
    public void SimilarElementsCount (int[] arr){
        System.out.print("\n");
        int len = getDistinctLength(arr);
        int index = 0;
        int[][] result = new int[len][2];
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
