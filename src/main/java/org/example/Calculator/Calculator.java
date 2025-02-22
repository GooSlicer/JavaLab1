package org.example.Calculator;

import java.util.Scanner;

public class Calculator {
    public void askForAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите действие: \n");
        System.out.print("1. +\n");
        System.out.print("2. -\n");
        System.out.print("3. *\n");
        System.out.print("4. /\n");
        System.out.print("Напишите 'Выход' для выхода\n");
        String action = scanner.next();

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        while (!action.equals("Выход")) { //черезе while сделать+++++
            switch (action) {
                case ("1"):
                    System.out.print("Ответ: " + ArithmeticalMethods.actionAddition(a, b) + "\n");
                    askForAction();
                    break;
                case ("2"):
                    System.out.print("Ответ: " + ArithmeticalMethods.actionSubtraction(a, b) + "\n");
                    askForAction();
                    break;
                case ("3"):
                    System.out.print("Ответ: " + ArithmeticalMethods.actionMultiplication(a, b) + "\n");
                    askForAction();
                    break;
                case ("4"):
                    System.out.print("Ответ: " + ArithmeticalMethods.actionDivision(a, b) + "\n");
                    askForAction();
                    break;
                default:
                    System.out.print("Неизвестная команда\n");
                    askForAction();
                    break;
            }
        }
    }
}
