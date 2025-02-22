package org.example.Tasks;

import java.util.Objects;
import java.util.Scanner;

public class Strings {
    //метод, задающий строки
    public String[] stringArray() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку номер " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        return strings;
    }
    //находит самую длинную строку
    public void findMinMaxString(String[] string) {
        String maxString = null;
        String minString = null;
        int maxStringLength = 0;
        int minStringLength = 0;
        for (String s : string) {
            if (s.length() > maxStringLength) {
                maxStringLength = s.length();
                maxString = s;
            }
            if (minStringLength == 0 || s.length() < minStringLength) {
                minStringLength = s.length();
                minString = s;
            }
        }
        if (Objects.equals(maxString, minString)){
            System.out.println("Минимальная и максимальная совпали");
        }
        else {
            System.out.println("Длина самой длинной: " + maxStringLength + " Самая длинная строка: " + maxString + "\n"
                    + "Длина самой короткой: " + minStringLength + " Самая короткая строка: " + minString);
        }
    }
    //находит среднюю длину
    public void findAverage(String[] string) {
        double sum = 0;
        double avg;
        for (String s : string) {
            sum += s.length();
        }
        if(!(string.length == 0)){
            avg = sum / string.length;
            System.out.println("Средняя длина: " + avg);
            for (String s : string) {
                if (s.length() > avg) {
                    System.out.println("Строка: " + s + " Длина: " + s.length());
                }
            }
        }
        else {
            System.out.println("Пустая строка");
        }
    }
    //находит строку с только числами
    public void findLineWithDigits(String[] string) {
        for (String s : string) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if (aChar == '0' || aChar == '1' || aChar == '2' || aChar == '3' || aChar == '4' || aChar == '5' || aChar == '6' || aChar == '7' || aChar == '8' || aChar == '9') {
                    System.out.print(aChar);
                }
            }
        }
    }
}
