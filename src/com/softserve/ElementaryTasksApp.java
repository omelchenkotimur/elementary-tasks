package com.softserve;

import com.softserve.handler.*;
import com.softserve.service.FileParserService;
import com.softserve.service.LuckyTicketService;
import com.softserve.util.Util;

import java.util.InputMismatchException;

public class ElementaryTasksApp {

    public static void main(String[] args) {

        boolean shouldContinueApp = true;
        while (shouldContinueApp) {

            int input = 0;
            boolean shouldContinue = true;
            while (shouldContinue) {
                System.out.println("Please, choose your task:\n" +
                        "1. Chessboard.\n" +
                        "2. Envelope.\n" +
                        "3. Triangle.\n" +
                        "4. File Parse.\n" +
                        "5. Number in words.\n" +
                        "6. Lucky Ticket.\n" +
                        "7. Simple Number Count.\n" +
                        "8. Fibonacci numbers from range.\n" +
                        "9. Fast Exponentiation.\n" +
                        "0. Exit.");
                try {
                    input = Util.getPositiveInt();
                    if (!(input == 0 || input == 1 || input == 2 || input == 3 || input == 4
                            || input == 5 || input == 6 || input == 7 || input == 8 || input == 9)) {
                        throw new InputMismatchException();
                    }
                    shouldContinue = false;
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input. Enter integer.");
                    Util.getPositiveInt();
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
                    boolean shouldContinueTriangleTask = true;
                    while (shouldContinueTriangleTask) {
                        triangleHandler.handle();
                        shouldContinueTriangleTask = Util.confirmation("Continue to compare triangles? Yes/No");
                    }
                    break;
                case 4:
                    System.out.println("You chose File Parser task.");
                    FileParserService fileParserService = new FileParserService();
                    FileParserHandler fileParserHandler = new FileParserHandler(fileParserService);
                    boolean shouldContinueFileParseTask = true;
                    while (shouldContinueFileParseTask) {
                        fileParserHandler.handle();
                        shouldContinueFileParseTask = Util.confirmation("Restart File Parse task? Yes/No");
                    }
                    break;
                case 5:
                    System.out.println("You choose Number In Words task");
                    NumberInWordsHandler numberInWordsHandler = new NumberInWordsHandler();
                    boolean shouldContinueNumberInWordsTask = true;
                    while (shouldContinueNumberInWordsTask) {
                        numberInWordsHandler.handle();
                        shouldContinueNumberInWordsTask = Util.confirmation("Enter new number? Yes/No");
                    }
                    break;
                case 6:
                    System.out.println("You choose Lucky Ticket task.");
                    LuckyTicketService luckyTicketService = new LuckyTicketService();
                    LuckyTicketHandler luckyTicketHandler = new LuckyTicketHandler(luckyTicketService);
                    boolean shouldContinueLuckyTicketTask = true;
                    while (shouldContinueLuckyTicketTask) {
                        luckyTicketHandler.handle();
                        shouldContinueLuckyTicketTask = Util.confirmation("Restart Lucky Ticket task? Yes/No");
                    }
                    break;
                case 7:
                    System.out.println("You choose Simple Number Counter task.");
                    SimpleNumberCountHandler simpleNumberCountHandler = new SimpleNumberCountHandler();
                    boolean shouldContinueSimpleNumberCountTask = true;
                    while (shouldContinueSimpleNumberCountTask) {
                        simpleNumberCountHandler.handle();
                        shouldContinueSimpleNumberCountTask = Util.confirmation("Enter new top value? Yes/No");
                    }
                    break;
                case 8:
                    System.out.println("You choose Fibonacci Numbers from range task.");
                    FibonacciNumbersHandler fibonacciNumbersHandler = new FibonacciNumbersHandler();
                    boolean shouldContinueFibonacciNumbersTask = true;
                    while (shouldContinueFibonacciNumbersTask) {
                        fibonacciNumbersHandler.handle();
                        shouldContinueFibonacciNumbersTask = Util.confirmation("Enter new range? Yes/No");
                    }
                    break;
                case 9:
                    System.out.println("You choose Fast Exponentiation task.");
                    FastExponentiationHandler fastExponentiationHandler = new FastExponentiationHandler();
                    boolean shouldContinueExponentiationTask = true;
                    while (shouldContinueExponentiationTask) {
                        fastExponentiationHandler.handle();
                        shouldContinueExponentiationTask = Util.confirmation("Exponentiate a new number? Yes/No");
                    }
                    break;
                default:
                    System.out.println("Unknown task.");
            }

            shouldContinueApp = Util.confirmation("Return to main menu? Yes/No");
        }
    }
}


