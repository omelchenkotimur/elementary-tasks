package com.softserve.service;

public class LuckyTicketService {

    private static final String MOSCOW_TYPE = "moscow";
    private static final String PITER_TYPE = "piter";

    public int count(int value, String type) throws IllegalArgumentException {
        int result = 0;
        String valueToString = Integer.toString(value);
        if (valueToString.length() % 2 == 1) {
            throw new IllegalArgumentException("Ticket number must contain even number of digits and starts not from \"0\"");
        }
        type = type.toLowerCase();
        for (int currentValue = 0; currentValue <= value; currentValue++) {
            StringBuilder valueToCount = format(currentValue, valueToString.length());
            if (type.equals(MOSCOW_TYPE)) {
                if (isMoscowType(valueToCount)) {
                    result++;
                }
            } else if (type.equals(PITER_TYPE)) {
                if (isPiterType(valueToCount)) {
                    result++;
                }
            } else {
                throw new IllegalArgumentException("Unknown ticket type!");
            }
        }
        return result;
    }

    private StringBuilder format(int value, int length) throws IllegalArgumentException {
        if (length > 8){
            throw new IllegalArgumentException("Ticket number must be less then 8 digits!");
        }
        StringBuilder result = new StringBuilder("00000000").append(value);
        result = new StringBuilder(result.substring(result.length() - length));
        return result;
    }

    private boolean isMoscowType(StringBuilder value) {
        String[] string = value.toString().split("");
        boolean result = false;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < string.length / 2; i++) {
            firstHalfSum += Integer.parseInt(string[i]);
        }
        for (int i = string.length / 2; i < string.length; i++) {
            secondHalfSum += Integer.parseInt(string[i]);
        }
        if (firstHalfSum == secondHalfSum) {
            result = true;
        }
        return result;
    }


    private boolean isPiterType(StringBuilder value) {
        String[] string = value.toString().split("");
        boolean result = false;
        int oddNumbersSum = 0;
        int evenNumbersSum = 0;
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 1) {
                oddNumbersSum += Integer.parseInt(string[i]);
            } else {
                evenNumbersSum += Integer.parseInt(string[i]);
            }
        }
        if (oddNumbersSum == evenNumbersSum) {
            result = true;
        }
        return result;
    }

}
