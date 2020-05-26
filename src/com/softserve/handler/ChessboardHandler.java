package com.softserve.handler;

import com.softserve.model.Chessboard;
import com.softserve.service.ChessboardService;
import com.softserve.util.ConsoleUtilties;

public class ChessboardHandler {

    public void handle() {
        System.out.println("Make your chessboard...");
        System.out.println("Enter length:");
        int length = ConsoleUtilties.getPositiveInt();
        System.out.println("Enter width:");
        int width = ConsoleUtilties.getPositiveInt();
        System.out.println("Enter cell:");
        String cell = ConsoleUtilties.getOneCharString();
        Chessboard chessboard = new Chessboard(length, width, cell);
        ChessboardService chessboardService = new ChessboardService(chessboard);
        System.out.println("Your chessboard is:");
        System.out.println(chessboardService.build());

    }
}
