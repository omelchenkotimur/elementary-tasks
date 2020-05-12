package test.service;

import com.softserve.model.Chessboard;
import com.softserve.service.ChessboardService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ChessboardServiceTest {

    private static ChessboardService chessboardService;

    @BeforeAll
    static void initialization() {
        chessboardService = new ChessboardService();
        System.out.println("ChessboardService test start");
    }

    @Test
    void testBuild() {
        Chessboard chessboard = new Chessboard(3, 3, "X");
        chessboardService.setChessboard(chessboard);
        String actualBoard = chessboardService.build().toString();
        String expectedBoard = new StringBuilder("X X\n X \nX X").toString();
        assertEquals("Fail to build chessboard", expectedBoard, actualBoard);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed");
    }
}