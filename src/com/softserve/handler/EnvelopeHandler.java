package com.softserve.handler;

import com.softserve.model.Envelope;
import com.softserve.service.EnvelopeService;
import com.softserve.util.ConsoleUtilties;

public class EnvelopeHandler {
    public void handle (){
        System.out.println("Enter first envelope length.");
        double firstEnvelopeLength = ConsoleUtilties.getPositiveDouble();
        System.out.println("Enter first envelope width.");
        double firstEnvelopeWidth = ConsoleUtilties.getPositiveDouble();
        System.out.println("Enter second envelope length.");
        double secondEnvelopeLength = ConsoleUtilties.getPositiveDouble();
        System.out.println("Enter second envelope width.");
        double secondEnvelopeWidth = ConsoleUtilties.getPositiveDouble();
        Envelope firstEnvelope = new Envelope(firstEnvelopeLength, firstEnvelopeWidth);
        Envelope secondEnvelope = new Envelope(secondEnvelopeLength, secondEnvelopeWidth);
        EnvelopeService envelopeService = new EnvelopeService();
        int result = envelopeService.compareEnvelopes(firstEnvelope,secondEnvelope);
        switch (result){
            case 1:
                System.out.println("Second envelope can be placed to first.");
                break;
            case -1:
                System.out.println("First envelope can be placed to second.");
                break;
            case 0:
                System.out.println("Envelope can't be placed to another.");
                break;
        }
    }
}
