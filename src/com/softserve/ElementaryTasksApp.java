package com.softserve;

import com.softserve.handler.*;
import com.softserve.service.FileParserService;
import com.softserve.service.LuckyTicketService;
import com.softserve.util.ConsoleUtilties;

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
                    input = ConsoleUtilties.getPositiveInt();
                    if (!(input == 0 || input == 1 || input == 2 || input == 3 || input == 4
                            || input == 5 || input == 6 || input == 7 || input == 8 || input == 9)) {
                        throw new InputMismatchException();
                    }
                    shouldContinue = false;
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input. Enter integer.");
                    ConsoleUtilties.getPositiveInt();
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
                        shouldContinueChessboardTask = ConsoleUtilties.confirmation("Continue to build another chessboard? Yes/No");
                    }
                    break;
                case 2:
                    System.out.println("You chose Envelope task.");
                    EnvelopeHandler envelopeHandler = new EnvelopeHandler();
                    boolean shouldContinueEnvelopeTask = true;
                    while (shouldContinueEnvelopeTask) {
                        envelopeHandler.handle();
                        shouldContinueEnvelopeTask = ConsoleUtilties.confirmation("Continue to compareEnvelopes envelopes? Yes/No");
                    }
                    break;
                case 3:
                    System.out.println("You chose Triangle task.");
                    TriangleHandler triangleHandler = new TriangleHandler();
                    boolean shouldContinueTriangleTask = true;
                    while (shouldContinueTriangleTask) {
                        triangleHandler.handle();
                        shouldContinueTriangleTask = ConsoleUtilties.confirmation("Continue to compareEnvelopes triangles? Yes/No");
                    }
                    break;
                case 4:
                    System.out.println("You chose File Parser task.");
                    FileParserService fileParserService = new FileParserService();
                    FileParserHandler fileParserHandler = new FileParserHandler(fileParserService);
                    boolean shouldContinueFileParseTask = true;
                    while (shouldContinueFileParseTask) {
                        fileParserHandler.handle();
                        shouldContinueFileParseTask = ConsoleUtilties.confirmation("Restart File Parse task? Yes/No");
                    }
                    break;
                case 5:
                    System.out.println("You choose Number In Words task");
                    NumberInWordsHandler numberInWordsHandler = new NumberInWordsHandler();
                    boolean shouldContinueNumberInWordsTask = true;
                    while (shouldContinueNumberInWordsTask) {
                        numberInWordsHandler.handle();
                        shouldContinueNumberInWordsTask = ConsoleUtilties.confirmation("Enter new number? Yes/No");
                    }
                    break;
                case 6:
                    System.out.println("You choose Lucky Ticket task.");
                    LuckyTicketService luckyTicketService = new LuckyTicketService();
                    LuckyTicketHandler luckyTicketHandler = new LuckyTicketHandler(luckyTicketService);
                    boolean shouldContinueLuckyTicketTask = true;
                    while (shouldContinueLuckyTicketTask) {
                        luckyTicketHandler.handle();
                        shouldContinueLuckyTicketTask = ConsoleUtilties.confirmation("Restart Lucky Ticket task? Yes/No");
                    }
                    break;
                case 7:
                    System.out.println("You choose Simple Number Counter task.");
                    SimpleNumberCountHandler simpleNumberCountHandler = new SimpleNumberCountHandler();
                    boolean shouldContinueSimpleNumberCountTask = true;
                    while (shouldContinueSimpleNumberCountTask) {
                        simpleNumberCountHandler.handle();
                        shouldContinueSimpleNumberCountTask = ConsoleUtilties.confirmation("Enter new top value? Yes/No");
                    }
                    break;
                case 8:
                    System.out.println("You choose Fibonacci Numbers from range task.");
                    FibonacciNumbersHandler fibonacciNumbersHandler = new FibonacciNumbersHandler();
                    boolean shouldContinueFibonacciNumbersTask = true;
                    while (shouldContinueFibonacciNumbersTask) {
                        fibonacciNumbersHandler.handle();
                        shouldContinueFibonacciNumbersTask = ConsoleUtilties.confirmation("Enter new range? Yes/No");
                    }
                    break;
                case 9:
                    System.out.println("You choose Fast Exponentiation task.");
                    FastExponentiationHandler fastExponentiationHandler = new FastExponentiationHandler();
                    boolean shouldContinueExponentiationTask = true;
                    while (shouldContinueExponentiationTask) {
                        fastExponentiationHandler.handle();
                        shouldContinueExponentiationTask = ConsoleUtilties.confirmation("Exponentiate a new number? Yes/No");
                    }
                    break;
                default:
                    System.out.println("Unknown task.");
            }

            shouldContinueApp = ConsoleUtilties.confirmation("Return to main menu? Yes/No");
        }
    }
}


