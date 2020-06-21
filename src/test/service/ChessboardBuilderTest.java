package test.service;

import com.softserve.model.Chessboard;
import com.softserve.service.ChessboardBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ChessboardBuilderTest {

    private static ChessboardBuilder chessboardBuilder;

    @BeforeAll
    static void initialization() {
        chessboardBuilder = new ChessboardBuilder();
        System.out.println("ChessboardBuilder test started.");
    }

    @Test
    void testBuild() {
        String expectedBoard = "X X\n X \nX X";
        Chessboard chessboard = new Chessboard(3, 3, "X");
        chessboardBuilder.setChessboard(chessboard);
        String actualBoard = chessboardBuilder.build();

        assertEquals("Fail to build chessboard", expectedBoard, actualBoard);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed.\n");
    }
}