package com.softserve.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle implements Comparable<Triangle> {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double square;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        double p = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        this.square = new BigDecimal(square).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "[Triangle " + name + "]: " + square + " cm";
    }

    @Override
    public int compareTo(Triangle triangle) {
        return Double.compare(this.square, triangle.square);
    }
}
