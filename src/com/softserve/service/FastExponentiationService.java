package com.softserve.service;

public class FastExponentiationService {
    public long binaryPower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        if (power % 2 == 1) {
            return binaryPower(number, power - 1) * number;
        } else {
            long result = binaryPower(number, power / 2);
            return result * result;
        }
    }
}
