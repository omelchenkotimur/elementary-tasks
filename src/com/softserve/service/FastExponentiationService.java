package com.softserve.service;

//валидация ввода параметров метода

public class FastExponentiationService {
    public long binaryPower(int number, int power) throws IllegalArgumentException {
        validateInputValues(number, power);
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

    private void validateInputValues(int number, int power) {
        if (number < 0) {
            throw new IllegalArgumentException("Number value must be positive!");
        }
        if (power < 0) {
            throw new IllegalArgumentException("Power value must be positive!");
        }
    }
}
