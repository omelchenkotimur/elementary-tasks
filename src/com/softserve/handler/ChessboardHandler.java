package com.softserve.handler;

import com.softserve.model.Chessboard;
import com.softserve.service.ChessboardBuilder;

import java.util.Scanner;

public class ChessboardHandler {

    private Scanner scanner = new Scanner(System.in);

    public void handle() {
        System.out.println("Make your chessboard...");
        System.out.println("Enter length:");
        int length = scanner.nextInt();
        System.out.println("Enter width:");
        int width = scanner.nextInt();
        System.out.println("Enter cell:");
        String cell = scanner.next();
        Chessboard chessboard = new Chessboard(length, width, cell);
        ChessboardBuilder chessboardBuilder = new ChessboardBuilder(chessboard);
        System.out.println("Your chessboard is:");
        System.out.println(chessboardBuilder.build());
    }
}
