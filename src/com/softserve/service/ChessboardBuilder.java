package com.softserve.service;

import com.softserve.model.Chessboard;

public class ChessboardBuilder {

    private Chessboard board;

    public ChessboardBuilder(Chessboard chessboard) {
        this.board = chessboard;
    }

    public StringBuilder build() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.getChessboard().getLength(); i++) {
            for (int j = 0; j < this.getChessboard().getWidth(); j++) {
                if ((i + j)% 2 == 1) {
                    result.append(' ');
                } else {
                    result.append(this.getChessboard().getCell());
                }
            }
            result.append('\n');
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
