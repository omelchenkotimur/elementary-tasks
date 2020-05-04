package com.softserve.service;

import com.softserve.model.Triangle;

import java.util.InputMismatchException;

public class TriangleService {

    public Triangle getTriangleFromInput(String value) throws InputMismatchException, IllegalArgumentException {
        String[] splitted = value.split(",");
        if (splitted.length != 4) {
            return null;//проброс ошибки в хендлер
        }

        String name = splitted[0].trim();
        double sideA;
        double sideB;
        double sideC;

        sideA = Double.parseDouble(splitted[1].trim());
        sideB = Double.parseDouble(splitted[2].trim());
        sideC = Double.parseDouble(splitted[3].trim());

        Triangle triangle = new Triangle(name, sideA, sideB, sideC);
        if (Double.isNaN(triangle.getSquare())) {
            System.out.println("Triangle sides mismatch.");
            return null;
        }
        return triangle;
    }
}
