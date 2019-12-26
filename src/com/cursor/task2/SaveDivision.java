package com.cursor.task2;

import java.util.Scanner;

public class SaveDivision {
    private int firstNumber;
    private int secondNumber;
    private Scanner scanner = new Scanner(System.in);

    private void inputNumbers() {
        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
    }

    public void divide() {
        inputNumbers();
        try {
            double result;
            result = (double) firstNumber / secondNumber;
            System.out.println("Result:" + result);
            if (result == Double.POSITIVE_INFINITY ||
                    result == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("You shouldn't divide by zero. Please, try again.");
        } finally {
            scanner.close();
        }
    }
}