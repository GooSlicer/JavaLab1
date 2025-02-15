package org.example.Tasks;

import java.util.Scanner;

public class Strings {
    public String[] stringArray() { //метод, задающий строки
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

    public void findMinMaxString(String[] string) { //находит самую длинную строку
        String maxString = null; //если одинаковые вывести все
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
        System.out.println("Длина самой длинной: " + maxStringLength + " Самая длинная строка: " + maxString + "\n"
                + "Длина самой короткой: " + minStringLength + " Самая короткая строка: " + minString);
    }

    public void findAverage(String[] string) { //находит среднюю длину
        int sum = 0;
        double avg;
        for (String s : string) {
            sum += s.length();
        }
        avg = (double) sum / string.length; //чтоб отработал без кастануть
        System.out.println("Средняя длина: " + avg);
        for (String s : string) {
            if (s.length() > avg) {
                System.out.println("Строка: " + s + " Длина: " + s.length());
            }
        }
    }

    public void findLineWithDigits(String[] string) { //находит строку с только числами
        for (String s : string) {
            if (s.contains("1234567890")) {
                System.out.println("Строка с только цифрами: " + s);
            }
            else {
                System.out.println("Нет строки с числами");
            }
        }
    }
}
