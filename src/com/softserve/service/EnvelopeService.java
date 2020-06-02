package com.softserve.service;

import com.softserve.model.Envelope;

/**
 * Service, that contains methods, which uses to work with envelopes.
 */
public class EnvelopeService implements Placeable {

    /**
     * Method, that uses to place envelopes to each other.
     *
     * @return int, that indicates variant of placing.
     */
    @Override
    public int place(Object firstFigure, Object secondFigure) throws IllegalArgumentException {
        boolean isEnvelopes = firstFigure instanceof Envelope && secondFigure instanceof Envelope;
        if (!isEnvelopes) {
            throw new IllegalArgumentException("Input error! You have to place envelopes.");
        }

        Envelope firstEnvelope = (Envelope) firstFigure;
        Envelope secondEnvelope = (Envelope) secondFigure;

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
