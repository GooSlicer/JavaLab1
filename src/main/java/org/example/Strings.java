package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Strings {
    public String[] StringArray(){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }

        String[] strings = new String[n];

        for (int i=0; i<n; i++) {
            System.out.print("Введите строку номер " + (i+1) + ": ");
            strings[i] = scanner.next();
        }
        return strings;
    }
    public void FindMinMaxString (String[] string) {
        String str = null;
        int max = 0;
        for (String s : string) {
            if (s.length() > max) {
                max = s.length();
                str = s;
            }
        }
        System.out.println("Длина: " + max + " Строка: " + str);
    }
    public void FindAverage (String[] string) {
        int max = 0;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < string.length; i++) {
            sum += string[i].length();
        }
        avg = sum/string.length;
        System.out.println("Средняя длина: " + avg);
        for (int i = 0; i < string.length; i++) {
            if(string[i].length() > avg){
                System.out.println("Строка: " + string[i] + " Длина: " + string[i].length());
            }
        }
    }
    public void FindLineWithDigits(String[] string) {
        for (int i = 0; i < string.length; i++) {
            if(Pattern.matches("[0-9]+", string[i]) && string[i].length() > 2){
                System.out.println("Строка с только цифрами: " + string[i]);
            }
        }
    }
}
