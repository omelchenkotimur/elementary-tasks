package com.softserve;

import com.softserve.handler.ChessboardHandler;
import com.softserve.handler.EnvelopeHandler;
import com.softserve.handler.TriangleHandler;
import com.softserve.model.Triangle;
import com.softserve.util.Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElementaryTasksRunner {

    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int input = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Please, choose your task:\n" +
                    "1. Chessboard.\n" +
                    "2. Envelope.\n" +
                    "3. Triangle.\n" +
                    "0. Exit.");
            try {
                input = scanner.nextInt();
                if (!(input == 0 || input == 1 || input == 2 || input == 3)) {
                    throw new InputMismatchException();
                }
                shouldContinue = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input. Enter integer.");
                scanner.nextLine();
            }
        }

        switch (input) {
            case 0:
                System.out.println("Exiting program.");
                break;
            case 1:
                System.out.println("You chose Chessboard task.");
                ChessboardHandler chessboardHandler = new ChessboardHandler();
                boolean shouldContinueChessboardTask = true;
                while (shouldContinueChessboardTask) {
                    chessboardHandler.handle();
                    shouldContinueChessboardTask = Util.confirmation("Continue to build another chessboard? Yes/No");
                }
                break;
            case 2:
                System.out.println("You chose Envelope task.");
                EnvelopeHandler envelopeHandler = new EnvelopeHandler();
                boolean shouldContinueEnvelopeTask = true;
                while (shouldContinueEnvelopeTask) {
                    envelopeHandler.handle();
                    shouldContinueEnvelopeTask = Util.confirmation("Continue to compare envelopes? Yes/No");
                }
                break;
            case 3:
                System.out.println("You chose Triangle task.");
                TriangleHandler triangleHandler = new TriangleHandler();
                boolean shouldContinueTriagleTask = true;
                while (shouldContinueTriagleTask) {
                    triangleHandler.handle();
                    shouldContinueTriagleTask = Util.confirmation("Continue to compare triangles? Yes/No");
                }
                break;
            default:
                System.out.println("Unknown task.");
        }
    }
}
/*        String input = null;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Please, choose your task:\n" +
                    "1. Chessboard.\n" +
                    "0. Exit.");
            input = scanner.next();
            if (input.equals("1") || input.equals("0")) {
                shouldContinue = false;
            } else {
                System.out.println("Incorrect input.");
            }
        }*/