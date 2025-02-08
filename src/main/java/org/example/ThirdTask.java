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
        String action = scanner.next();

        if (Objects.equals(action, "+")) {
            System.out.print(ArithmeticalMethods.ActionAddition(a, b));
            AskForAction();
        }
        else {
            if (Objects.equals(action, "-")) {
                System.out.print(ArithmeticalMethods.ActionSubtraction(a, b));
                AskForAction();
            }
            else {
                if (Objects.equals(action, "*")) {
                    System.out.print(ArithmeticalMethods.ActionMultiplication(a, b));
                    AskForAction();
                }
                else {
                    if(Objects.equals(action, "/")) {
                        System.out.print(ArithmeticalMethods.ActionDivision(a, b));
                        AskForAction();
                    }
                    else {
                        System.out.print("Неизвестная команда");
                        AskForAction();
                    }
                }
            }
        }
    }
}
