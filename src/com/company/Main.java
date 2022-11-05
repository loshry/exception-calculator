package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        try {
            calculate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void calculate() throws Exception {
        Calculator calculator = new Calculator();


        System.out.println("Enter operation (+,-,*,/):");
        String operation = scanner.next();

        System.out.println("Enter first number:");
        int number1 = captureNumber();

        if (String.valueOf(number1).length() > 8) {
            throw new Exception("Number is too long!");
        }

        System.out.println("Enter second number:");
        int number2 = captureNumber();

        int result;

        if (operation.equals("+")) {
            result = calculator.add(number1, number2);
        } else if (operation.equals("-")) {
            result = calculator.subtract(number1, number2);
        } else if (operation.equals("*")) {
            result = calculator.multiply(number1, number2);
        } else {
            result = calculator.divide(number1, number2);
        }

        System.out.println(result);
    }

    private static int captureNumber() throws Exception {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("This calculator only works with integers. Try again!");
        }
    }
}