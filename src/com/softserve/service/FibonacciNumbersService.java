package com.softserve.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Service, that contains methods, which uses for finding Fibonacci numbers from input range.
 */
public class FibonacciNumbersService {

    public ArrayList getFibonacciNumbersFromRange(int initialValue, int finalValue) throws IllegalArgumentException {

        validateInputRange(initialValue, finalValue);
        HashMap<Integer, Integer> fibonacciNumbers = getFibonacciHashMap();
        List<Integer> resultList = new ArrayList<>();
        for (int fibonacciNumber : fibonacciNumbers.values()) {
            if (fibonacciNumber > initialValue && fibonacciNumber < finalValue) {
                resultList.add(fibonacciNumber);
            }
        }
        return (ArrayList) resultList;
    }

    private HashMap<Integer, Integer> getFibonacciHashMap() {
        HashMap<Integer, Integer> fibonacciNumbers = new HashMap<>(45);
        fibonacciNumbers.put(0, 0);
        fibonacciNumbers.put(1, 1);
        fibonacciNumbers.put(2, 1);
        fibonacciNumbers.put(3, 2);
        fibonacciNumbers.put(4, 3);
        fibonacciNumbers.put(5, 5);
        fibonacciNumbers.put(6, 8);
        fibonacciNumbers.put(7, 13);
        fibonacciNumbers.put(8, 21);
        fibonacciNumbers.put(9, 34);
        fibonacciNumbers.put(10, 55);
        fibonacciNumbers.put(11, 89);
        fibonacciNumbers.put(12, 144);
        fibonacciNumbers.put(13, 233);
        fibonacciNumbers.put(14, 377);
        fibonacciNumbers.put(15, 610);
        fibonacciNumbers.put(16, 987);
        fibonacciNumbers.put(17, 1597);
        fibonacciNumbers.put(18, 2584);
        fibonacciNumbers.put(19, 4181);
        fibonacciNumbers.put(20, 6765);
        fibonacciNumbers.put(21, 10946);
        fibonacciNumbers.put(22, 17711);
        fibonacciNumbers.put(23, 28657);
        fibonacciNumbers.put(24, 46368);
        fibonacciNumbers.put(25, 75025);
        fibonacciNumbers.put(26, 121393);
        fibonacciNumbers.put(27, 196418);
        fibonacciNumbers.put(28, 317811);
        fibonacciNumbers.put(29, 514229);
        fibonacciNumbers.put(30, 832040);
        fibonacciNumbers.put(31, 1346269);
        fibonacciNumbers.put(32, 2178309);
        fibonacciNumbers.put(33, 3524578);
        fibonacciNumbers.put(34, 5702887);
        fibonacciNumbers.put(35, 9227465);
        fibonacciNumbers.put(36, 14930352);
        fibonacciNumbers.put(37, 24157817);
        fibonacciNumbers.put(38, 39088169);
        fibonacciNumbers.put(39, 63245986);
        fibonacciNumbers.put(40, 102334155);
        fibonacciNumbers.put(41, 165580141);
        fibonacciNumbers.put(42, 267914296);
        fibonacciNumbers.put(43, 433494437);
        fibonacciNumbers.put(44, 701408733);
        return fibonacciNumbers;
    }

    private void validateInputRange(int initialValue, int finalValue) {
        if (initialValue < 0) {
            throw new IllegalArgumentException("InitialValue must be positive!");
        }
        if (finalValue < 0) {
            throw new IllegalArgumentException("FinalValue must be positive!");
        }
        if (finalValue < initialValue) {
            throw new IllegalArgumentException("FinalValue must be bigger then InitialValue!");
        }
    }
}
