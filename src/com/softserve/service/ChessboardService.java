package com.softserve.service;

import com.softserve.model.Chessboard;

/**
 * Service, that contains methods, which uses to work with chessboard.
 */
public class ChessboardService {

    private Chessboard board;

    public ChessboardService() {
    }

    public ChessboardService(Chessboard chessboard) {
        this.board = chessboard;
    }

    /**
     * Method, that uses to build a chessboard.
     *
     * @return StringBuilder object, that contains built board.
     */
    public StringBuilder build() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= this.getChessboard().getLength(); i++) {
            for (int j = 1; j <= this.getChessboard().getWidth(); j++) {
                if ((i + j) % 2 == 1) {
                    result.append(' ');
                } else {
                    result.append(this.getChessboard().getCell());
                }
            }
            if (i != getChessboard().getLength()) {
                result.append('\n');
            }
        }
        return result;
    }

    public Chessboard getChessboard() {
        return board;
    }

    public void setChessboard(Chessboard chessboard) {
        this.board = chessboard;
    }
}
