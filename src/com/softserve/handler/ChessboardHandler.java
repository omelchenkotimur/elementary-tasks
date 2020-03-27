package com.softserve.handler;

import com.softserve.model.Chessboard;
import com.softserve.service.ChessboardBuilder;
import com.softserve.util.Util;

import java.util.Scanner;

public class ChessboardHandler {

    private Scanner scanner = new Scanner(System.in);

    public void handle() {
        System.out.println("Make your chessboard...");
        System.out.println("Enter length:");
        int length = Util.getPositiveInt();
        System.out.println("Enter width:");
        int width = Util.getPositiveInt();
        System.out.println("Enter cell:");
        String cell = Util.getOneCharString();
        Chessboard chessboard = new Chessboard(length, width, cell);
        ChessboardBuilder chessboardBuilder = new ChessboardBuilder(chessboard);
        System.out.println("Your chessboard is:");
        System.out.println(chessboardBuilder.build());
    }
}
