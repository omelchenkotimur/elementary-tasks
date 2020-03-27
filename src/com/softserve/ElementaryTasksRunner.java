package com.softserve;

import com.softserve.handler.ChessboardHandler;

import java.util.Scanner;

public class ElementaryTasksRunner {

    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Please, choose your task:\n" +
                    "1. Chessboard.\n" +
                    "0. Exit.");
            input = scanner.nextInt();
            if (input == 1 || input == 0) {
                shouldContinue = false;
            } else {
                System.out.println("Incorrect input.");
            }
        }

        switch (input) {
            case 1:
                System.out.println("You choosed Chessboard task");
                ChessboardHandler chessboardHandler = new ChessboardHandler();
                chessboardHandler.handle();
                break;
            case 0:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Unknown task.");
        }
    }
}
