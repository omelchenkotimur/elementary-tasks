package com.softserve.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

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

    public static String readFileIntoString(String filePath) {
        String result = null;
        try {
            result = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
        return result;
    }

    public static void updateFileWithString(String filePath, String value) {
        try {
            Files.write(Paths.get(filePath), value.getBytes());
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
    }

    public static int getIntLessBillion() {
        int input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                input = scanner.nextInt();
                if (input < -999999999 || input > 999999999) {
                    throw new InputMismatchException();
                }
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println("False input. Number value is out of bound");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static boolean checkSimple(int number) {
        if (number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= number) {
            if (number % n == 0 || number % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}


