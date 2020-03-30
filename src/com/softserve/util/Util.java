package com.softserve.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    static Scanner scanner = new Scanner(System.in);

    public static int getPositiveInt() {
        int input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                input = scanner.nextInt();
                if (input < 0) {
                    throw new InputMismatchException();
                }
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println("False input. Enter positive integer.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getOneCharString() {
        String input = null;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.next();
            if (input.length() == 1) {
                shouldContinue = false;
            }
            System.out.println("False input. Enter one character");
        }
        return input;
    }

    public static boolean confirmation(String message) {
        System.out.println(message);
        String input;
        boolean result = false;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.nextLine();
            if (input.equals("")) {
                input = scanner.nextLine();
            }
            input = input.toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                result = true;
                shouldContinue = false;
            } else if (input.equals("no") || input.equals("n")) {
                shouldContinue = false;
            } else {
                System.out.println("Incorrect input.");
            }
        }
        return result;
    }

    public static double getPositiveDouble() {
        double input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                input = scanner.nextDouble();
                if (input < 0) {
                    throw new InputMismatchException();
                }
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println("False input. Enter positive double.");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static String getString() {
        String input = null;
        boolean shouldContinue = true;
        while (shouldContinue) {
            input = scanner.nextLine();
            if (input.equals("")) {
                input = scanner.nextLine();
            }
            shouldContinue = false;
        }
        return input;
    }

    public static double calculateGeroneSquare(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return new BigDecimal(square).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}


