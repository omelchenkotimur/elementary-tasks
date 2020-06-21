package com.softserve.service;

import com.softserve.model.Chessboard;

/**
 * Service, that contains methods, which uses to work with chessboard.
 */
public class ChessboardBuilder implements Buildable {

    private Chessboard board;

    public ChessboardBuilder() {
    }

    public ChessboardBuilder(Chessboard chessboard) {
        this.board = chessboard;
    }

    /**
     * Method, that uses to build a chessboard.
     *
     * @return StringBuilder object, that contains built board.
     */
    @Override
    public String build() {
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
        return String.valueOf(result);
    }

    private Chessboard getChessboard() {
        return board;
    }

    public void setChessboard(Chessboard chessboard) {
        this.board = chessboard;
    }
}
