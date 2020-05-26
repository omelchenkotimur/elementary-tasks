package com.softserve.handler;

import com.softserve.service.LuckyTicketService;
import com.softserve.util.ConsoleUtilties;
import com.softserve.util.FileProcessingUtilities;

public class LuckyTicketHandler {

    private LuckyTicketService luckyTicketService;

    public LuckyTicketHandler(LuckyTicketService luckyTicketService) {
        this.luckyTicketService = luckyTicketService;
    }

    public void handle() {
        System.out.println("Enter filepath.");
        String type = FileProcessingUtilities.readFileIntoString(ConsoleUtilties.getString());
        System.out.println("Enter ticket number.");
        int ticketNumber = ConsoleUtilties.getPositiveInt();
        try {
            System.out.println(luckyTicketService.count(ticketNumber, type));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

