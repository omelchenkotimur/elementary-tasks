package com.softserve.util;

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
                System.out.println("False input. Enter positive number.");
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
}
