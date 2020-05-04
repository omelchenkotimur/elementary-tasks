package com.softserve.handler;

import com.softserve.service.FibonachiNumbersService;
import com.softserve.util.Util;

public class FibonachiNumbersHandler {

    FibonachiNumbersService fibonachiNumbersService = new FibonachiNumbersService();

    public void handle(){
        System.out.println("Enter the initial value from 0 to 999 999 999.");
        int initialvalue = Util.getPositiveInt();
        System.out.println("Enter the final value from 0 to 999 999 999.");
        int finalValue = Util.getPositiveInt();
        System.out.println("Fibonachi Numbers in entered range are:");
        System.out.println(fibonachiNumbersService.getFibonachiNumbersFromRange(initialvalue,finalValue));
    }
}
