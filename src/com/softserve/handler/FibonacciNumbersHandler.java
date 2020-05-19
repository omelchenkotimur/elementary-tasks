package com.softserve.handler;

import com.softserve.service.FibonacciNumbersService;
import com.softserve.util.Util;

public class FibonacciNumbersHandler {

    FibonacciNumbersService fibonacciNumbersService = new FibonacciNumbersService();

    public void handle(){
        System.out.println("Enter the initial value from 0 to 999 999 999.");
        int initialvalue = Util.getPositiveInt();
        System.out.println("Enter the final value from 0 to 999 999 999.");
        int finalValue = Util.getPositiveInt();
        System.out.println("Fibonacci Numbers in entered range are:");
        System.out.println(fibonacciNumbersService.getFibonacciNumbersFromRange(initialvalue,finalValue));
    }
}
