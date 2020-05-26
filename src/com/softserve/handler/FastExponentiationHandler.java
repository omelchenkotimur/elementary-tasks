package com.softserve.handler;

import com.softserve.service.FastExponentiationService;
import com.softserve.util.ConsoleUtilties;

public class FastExponentiationHandler {

    private FastExponentiationService fastExponentiationService = new FastExponentiationService();

    public void handle() {
        System.out.println("Enter the number");
        int number = ConsoleUtilties.getPositiveInt();
        System.out.println("Enter the the power value");
        int power = ConsoleUtilties.getPositiveInt();
        long time = System.currentTimeMillis();
        long result = fastExponentiationService.binaryPower(number, power);
        System.out.println("Exponentiation time is " + (double) (System.currentTimeMillis() - time) + "ms.");
        if (result < 999999999) {
            System.out.println("Result is " + result);
        } else System.out.println("Result is out of bound");
    }
}
