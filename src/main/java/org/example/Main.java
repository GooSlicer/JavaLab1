package org.example;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("\n***МАССИВ***\n");
        FirstTask fillingArray = new FirstTask();
        int[] array = fillingArray.FillingRandomArray();

        System.out.print("\n***ПОМЕНЯТЬ МЕСТАМИ МИНМАКС***\n");
        FirstTask swap = new FirstTask();
        swap.swapMinMax(array);

        System.out.print("\n\n***СЛОЖИТЬ ЧЕТНЫЕ***");
        FirstTask sum = new FirstTask();
        sum.SumEvenElements(array);

        System.out.print("\n\n***РАЗНИЦА***");
        FirstTask difference = new FirstTask();
        difference.FindDifference(array);

        System.out.print("\n\n***ПОДСЧЕТ***");
        FirstTask count = new FirstTask();
        count.SimilarElementsCount(array);

        System.out.print("\n\n***ЗАМЕНА ОТРИЦАТЕЛЬНЫХ***");
        FirstTask replace = new FirstTask();
        replace.ReplaceNegativeElements(array);

        System.out.print("\n\n***СТРОКА***\n");
        SecondTask string = new SecondTask();
        String[] strings = string.StringArray();

        System.out.print("\n***КОРОТКАЯ И ДЛИННАЯ***\n");
        SecondTask minmaxstr = new SecondTask();
        minmaxstr.FindMinMaxString(strings);

        System.out.print("\n***СРЕДНЯЯ ДЛИНА***\n");
        SecondTask avg = new SecondTask();
        avg.FindAverage(strings);

        System.out.print("\n***СТРОКА С ЧИСЛАМИ***\n");
        SecondTask digits = new SecondTask();
        digits.FindLineWithDigits(strings);
    }
}

