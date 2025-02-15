package org.example;

import org.example.Calculator.Calculator;
import org.example.Tasks.Arrays;
import org.example.Tasks.Strings;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n***МАССИВ***\n");
        Arrays fillingArray = new Arrays();
        int[] array = fillingArray.fillingRandomArray(20, -10, 10);

        System.out.print("\n***ПОМЕНЯТЬ МЕСТАМИ МИНМАКС***\n");
        Arrays swap = new Arrays();
        swap.swapMinMax(array);

        System.out.print("\n\n***СЛОЖИТЬ ЧЕТНЫЕ***");
        Arrays sum = new Arrays();
        sum.sumEvenElements(array);

        System.out.print("\n\n***РАЗНИЦА***");
        Arrays difference = new Arrays();
        difference.findDifference(array);

        System.out.print("\n\n***ПОДСЧЕТ***");
        Arrays count = new Arrays();
        count.similarElementsCount(array);

        System.out.print("\n\n***ЗАМЕНА ОТРИЦАТЕЛЬНЫХ***");
        Arrays replace = new Arrays();
        replace.replaceNegativeElements(array);

        System.out.print("\n\n***СТРОКА***\n");
        Strings string = new Strings();
        String[] strings = string.stringArray();

        System.out.print("\n***КОРОТКАЯ И ДЛИННАЯ***\n");
        Strings minmaxstring = new Strings();
        minmaxstring.findMinMaxString(strings);

        System.out.print("\n***СРЕДНЯЯ ДЛИНА***\n");
        Strings avg = new Strings();
        avg.findAverage(strings);

        System.out.print("\n***СТРОКА С ЧИСЛАМИ***\n");
        Strings digits = new Strings();
        digits.findLineWithDigits(strings);

        System.out.print("\n***КАЛЬКУЛЯТОР***\n");
        Calculator calc = new Calculator();
        calc.askForAction();
    }
}

