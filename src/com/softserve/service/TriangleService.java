package com.softserve.service;

import com.softserve.model.Triangle;

import javax.naming.NameNotFoundException;
import java.util.InputMismatchException;

public class TriangleService {

    public Triangle getTriangleFromInput(String value) {
        String[] splitted = value.split(",");
        if (splitted.length != 4) {
            return null;
        }

        String name = splitted[0].trim();
        double sideA;
        double sideB;
        double sideC;

        try {
            sideA = Double.parseDouble(splitted[1].trim());
            sideB = Double.parseDouble(splitted[2].trim());
            sideC = Double.parseDouble(splitted[3].trim());
        } catch (InputMismatchException exception) {
            return null;
        }
        Triangle triangle = new Triangle(name, sideA, sideB, sideC);
        if (Double.isNaN(triangle.getSquare())){
            System.out.println("Triangle sides mismatch.");
            return null;
        }
        return triangle;
    }
}
