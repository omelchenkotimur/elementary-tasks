package com.softserve.service;

import com.softserve.model.Envelope;

public class EnvelopeService {

    public int compare(Envelope firstEnvelope, Envelope secondEnvelope) {
        if ((firstEnvelope.getLength() < secondEnvelope.getLength() &&
                firstEnvelope.getWidth() < secondEnvelope.getWidth()) ||
                (firstEnvelope.getLength() < secondEnvelope.getWidth() &&
                        firstEnvelope.getWidth() < secondEnvelope.getLength())) {
            return -1;
        } else if ((firstEnvelope.getLength() > secondEnvelope.getLength() &&
                firstEnvelope.getWidth() > secondEnvelope.getWidth()) ||
                (firstEnvelope.getLength() > secondEnvelope.getWidth() &&
                        firstEnvelope.getWidth() > secondEnvelope.getLength())) {
            return 1;
        } else {
            return 0;
        }
    }
}
