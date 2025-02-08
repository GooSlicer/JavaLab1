package org.example;

public class ArithmeticalMethods {
    public static int ActionAddition(int a, int b){
        return a + b;
    }

    public static int ActionSubtraction(int a, int b){
        return a - b;
    }

    public static int ActionMultiplication(int a, int b){
        return a * b;
    }

    public static int ActionDivision(int a, int b){
        if (b == 0){
            System.out.print("Знаменатель не может быть равен нулю");
            return 0;
        }
        else{
            return a / b;
        }
    }
}
