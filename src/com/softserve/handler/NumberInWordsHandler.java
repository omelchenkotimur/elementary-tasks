package com.softserve.handler;

import com.softserve.service.NumberInWordsService;
import com.softserve.util.Util;

public class NumberInWordsHandler {

    NumberInWordsService numberInWordsService = new NumberInWordsService();

    public void handle() {
        int number;
        System.out.println("Enter a number up to 999 999 999");
        number = Util.getIntLessBillion();
        if (number == 0) {
            System.out.println("Number in words: Zero");
        } else {
            System.out.println("Number in words: " + numberInWordsService.numberInWords(number));
        }
    }
}