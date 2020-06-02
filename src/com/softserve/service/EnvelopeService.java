package com.softserve.service;

import com.softserve.model.Envelope;

/**
 * Service, that contains methods, which uses to work with envelopes.
 */
public class EnvelopeService implements CompareFiguresToPutOneToAnother {

    @Override
    public int compareEnvelopes(Envelope firstEnvelope, Envelope secondEnvelope) {
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
