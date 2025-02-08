package org.example;

import java.util.Objects;
import java.util.Scanner;

public class ThirdTask {
    public void AskForAction(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int b = scanner.nextInt();

        System.out.print("Выберите действие: \n");
        System.out.print("1. +\n");
        System.out.print("2. -\n");
        System.out.print("3. *\n");
        System.out.print("4. /\n");
        System.out.print("Напишите 'Выход'\n");
        String action = scanner.next();
        if (Objects.equals(action, "Выход\n")){
            System.exit(1);
        }
        if (Objects.equals(action, "+")) {
            System.out.print("Ответ: " + ArithmeticalMethods.ActionAddition(a, b) + "\n");
            AskForAction();
        }
        else {
            if (Objects.equals(action, "-")) {
                System.out.print("Ответ: " + ArithmeticalMethods.ActionSubtraction(a, b) + "\n");
                AskForAction();
            }
            else {
                if (Objects.equals(action, "*")) {
                    System.out.print("Ответ: " + ArithmeticalMethods.ActionMultiplication(a, b) + "\n");
                    AskForAction();
                }
                else {
                    if(Objects.equals(action, "/")) {
                        System.out.print("Ответ: " + ArithmeticalMethods.ActionDivision(a, b) + "\n");
                        AskForAction();
                    }
                    else {
                        System.out.print("Неизвестная команда\n");
                        AskForAction();
                    }
                }
            }
        }
    }
}
