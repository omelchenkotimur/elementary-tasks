package com.softserve.handler;

import com.softserve.model.Triangle;
import com.softserve.service.TriangleService;
import com.softserve.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class TriangleHandler {
    public void handle() {

        TriangleService triangleService = new TriangleService();
        List<Triangle> triangleList = new ArrayList<>();

        boolean shouldContinueTriangleInput = true;
        while (shouldContinueTriangleInput) {
            System.out.println("Enter triangle's name, side A, side B, side C.");
            String input = Util.getString();
            try {
                Triangle triangle = triangleService.getTriangleFromInput(input);
                triangleList.add(triangle);
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
            shouldContinueTriangleInput = Util.confirmation("Add new triangle? Yes/No");
        }
        Collections.sort(triangleList);
        Collections.reverse(triangleList);
        int counter = 1;
        for (Triangle triangle : triangleList) {
            System.out.println(counter++ + ". " + triangle + ".");
        }
    }
}
