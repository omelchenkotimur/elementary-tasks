package com.softserve.model;

public class Chessboard {
    private int length;
    private int width;
    private String cell;

    public Chessboard(int length, int width, String cell) {
        this.length = length;
        this.width = width;
        this.cell = cell;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
