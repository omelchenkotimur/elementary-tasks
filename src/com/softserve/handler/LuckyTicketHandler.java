package com.softserve.handler;

import com.softserve.service.LuckyTicketService;
import com.softserve.util.Util;

public class LuckyTicketHandler {

    private LuckyTicketService luckyTicketService;

    public LuckyTicketHandler(LuckyTicketService luckyTicketService) {
        this.luckyTicketService = luckyTicketService;
    }

    public void handle() {
        System.out.println("Enter filepath.");
        String type = Util.readFileIntoString(Util.getString());
        System.out.println("Enter ticket number.");
        int ticketNumber = Util.getPositiveInt();
        try {
            System.out.println(luckyTicketService.count(ticketNumber, type));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

