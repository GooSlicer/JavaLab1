package org.example.Calculator;

import java.util.Scanner;

public class Calculator {
    private double result = 0;
    private boolean isFirstOperation = true;

    public void askForAction() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (isFirstOperation) {
                System.out.print("Введите выражение или 'exit' для выхода: ");
            } else {
                System.out.print("Введите оператор и число или 'exit' для выхода: ");
            }

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                if (isFirstOperation) {
                    result = evaluateExpression(input);
                    isFirstOperation = false;
                } else {
                    result = evaluateNextOperation(input, result);
                }
                System.out.printf("Результат: %.3f%n", result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private double evaluateExpression(String expression) {
        if (expression.contains("sqrt")) {
            return evaluateSquareRoot(expression);
        } else {
            return evaluateBinaryOperation(expression);
        }
    }

    private double evaluateBinaryOperation(String expression) {
        String[] parts = expression.split("(?<=[-+*/^])|(?=[-+*/^])");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение.");
        }

        double a = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double b = Double.parseDouble(parts[2]);

        return performOperation(a, b, operator);
    }

    private double evaluateSquareRoot(String expression) {
        String numberPart = expression.replace("sqrt", "").trim();
        double number = Double.parseDouble(numberPart);
        if (number < 0) {
            throw new IllegalArgumentException("Квадратный корень из отрицательного числа невозможен.");
        }
        return Math.sqrt(number);
    }

    private double evaluateNextOperation(String input, double currentResult) {
        String[] parts = input.split("(?<=[-+*/^])|(?=[-+*/^])");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Некорректный ввод.");
        }

        String operator = parts[0];
        double b = Double.parseDouble(parts[1]);

        return performOperation(currentResult, b, operator);
    }

    private double performOperation(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно.");
                }
                yield a / b;
            }
            case "^" -> Math.pow(a, b);
            default -> throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        };
    }
}