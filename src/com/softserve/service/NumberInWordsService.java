package com.softserve.service;

/**
 * Service, that contains methods, which uses to parse number into number in words.
 */
public class NumberInWordsService {

    public String numberInWords(int number) throws IllegalArgumentException {
        validateMaxValue(number);
        String words = "";
        String[] unitsArray = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tensArray = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            String numberString = "" + number;
            numberString = numberString.substring(1);
            return "minus " + numberInWords(Integer.parseInt(numberString));
        }

        if ((number / 1000000) > 0) {
            words += numberInWords(number / 1000000) + " million ";
            number %= 1000000;
        }
        if ((number / 1000) > 0) {
            words += numberInWords(number / 1000) + " thousand ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += numberInWords(number / 100) + " hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 20) {

                words += unitsArray[number];
            } else {

                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }
        return words;
    }

    private void validateMaxValue (int number){
        if (number>999999999){
            throw new IllegalArgumentException("Input number must be less then billion!");
        }
    }
}
