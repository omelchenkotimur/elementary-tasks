package com.softserve.service;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumberCountService {
    public List<Integer> simpleNumberCountWhichSquareLessThenInput(int number) throws IllegalArgumentException {
        validateInput(number);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i * i < number; i++) {
            if (SimpleNumberCountService.checkSimple(i))
                resultList.add(i);
        }
        return resultList;
    }

    private static boolean checkSimple(int number) {
        if (number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= number) {
            if (number % n == 0 || number % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    private void validateInput(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive!");
        }
    }
}
