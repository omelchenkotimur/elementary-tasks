package com.softserve.service;

import com.softserve.model.Triangle;

import java.util.InputMismatchException;

/**
 * Service, that contains methods, which uses to compareEnvelopes triangles & put them into ascending list.
 */
public class TriangleService {

    public Triangle getTriangleFromInput(String value) throws InputMismatchException {
        String[] splitted = value.split(",");
        if (splitted.length != 4) {
            throw new InputMismatchException("Incorrect input.");
        }

        String name = splitted[0].trim();
        double sideA;
        double sideB;
        double sideC;

        sideA = Double.parseDouble(splitted[1].trim());
        sideB = Double.parseDouble(splitted[2].trim());
        sideC = Double.parseDouble(splitted[3].trim());

        Triangle triangle;
        try {
            triangle = new Triangle(name, sideA, sideB, sideC);
        }catch (NumberFormatException unused){
            throw new InputMismatchException("Triangle with such sides cannot be built!");
        }
        return triangle;
    }
}
