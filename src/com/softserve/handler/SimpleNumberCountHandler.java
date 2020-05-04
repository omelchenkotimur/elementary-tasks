package com.softserve.handler;

import com.softserve.service.SimpleNumberCountService;
import com.softserve.util.Util;

public class SimpleNumberCountHandler {

    SimpleNumberCountService simpleNumberCountService = new SimpleNumberCountService();

    public void handle() {

        System.out.println("Enter the top value of counting.");
        int topValue = Util.getPositiveInt();
        System.out.println("The simple numbers which square is less then your input are:");
        System.out.println(simpleNumberCountService.simpleNumberCount(topValue));
    }
}
