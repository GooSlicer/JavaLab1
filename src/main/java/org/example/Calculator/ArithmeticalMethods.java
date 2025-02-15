package org.example.Calculator;

public class ArithmeticalMethods {
    public static int actionAddition(int a, int b) { // Сложение
        return a + b;
    }

    public static int actionSubtraction(int a, int b) { // Вычитание
        return a - b;
    }

    public static int actionMultiplication(int a, int b) { // Умножение
        return a * b;
    }

    public static float actionDivision(int a, int b) { // Деление
        if (b == 0) {
            System.out.print("Знаменатель не может быть равен нулю\n");
            return 0;
        } else {
            return (float) a / b;
        }
    }
}
