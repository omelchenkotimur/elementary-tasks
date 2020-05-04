package com.softserve.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FibonachiNumbersService {

    public ArrayList getFibonachiNumbersFromRange(int initialValue, int finalValue) {

        HashMap<Integer, Integer> fibonachiNumbers = new HashMap<>(45);
        fibonachiNumbers.put(0, 0);
        fibonachiNumbers.put(1, 1);
        fibonachiNumbers.put(2, 1);
        fibonachiNumbers.put(3, 2);
        fibonachiNumbers.put(4, 3);
        fibonachiNumbers.put(5, 5);
        fibonachiNumbers.put(6, 8);
        fibonachiNumbers.put(7, 13);
        fibonachiNumbers.put(8, 21);
        fibonachiNumbers.put(9, 34);
        fibonachiNumbers.put(10, 55);
        fibonachiNumbers.put(11, 89);
        fibonachiNumbers.put(12, 144);
        fibonachiNumbers.put(13, 233);
        fibonachiNumbers.put(14, 377);
        fibonachiNumbers.put(15, 610);
        fibonachiNumbers.put(16, 987);
        fibonachiNumbers.put(17, 1597);
        fibonachiNumbers.put(18, 2584);
        fibonachiNumbers.put(19, 4181);
        fibonachiNumbers.put(20, 6765);
        fibonachiNumbers.put(21, 10946);
        fibonachiNumbers.put(22, 17711);
        fibonachiNumbers.put(23, 28657);
        fibonachiNumbers.put(24, 46368);
        fibonachiNumbers.put(25, 75025);
        fibonachiNumbers.put(26, 121393);
        fibonachiNumbers.put(27, 196418);
        fibonachiNumbers.put(28, 317811);
        fibonachiNumbers.put(29, 514229);
        fibonachiNumbers.put(30, 832040);
        fibonachiNumbers.put(31, 1346269);
        fibonachiNumbers.put(32, 2178309);
        fibonachiNumbers.put(33, 3524578);
        fibonachiNumbers.put(34, 5702887);
        fibonachiNumbers.put(35, 9227465);
        fibonachiNumbers.put(36, 14930352);
        fibonachiNumbers.put(37, 24157817);
        fibonachiNumbers.put(38, 39088169);
        fibonachiNumbers.put(39, 63245986);
        fibonachiNumbers.put(40, 102334155);
        fibonachiNumbers.put(41, 165580141);
        fibonachiNumbers.put(42, 267914296);
        fibonachiNumbers.put(43, 433494437);
        fibonachiNumbers.put(44, 701408733);

        List<Integer> listFibonachiNumbers = new ArrayList<>();
        for (int fibonachiNumber : fibonachiNumbers.values()) {
            if (fibonachiNumber > initialValue && fibonachiNumber < finalValue) {
                listFibonachiNumbers.add(fibonachiNumber);
            }
        }return (ArrayList) listFibonachiNumbers;
    }
}
