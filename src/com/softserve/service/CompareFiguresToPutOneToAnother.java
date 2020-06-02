package com.softserve.service;

import com.softserve.model.Envelope;

public interface CompareFiguresToPutOneToAnother {

    int compareEnvelopes(Envelope firstEnvelope, Envelope secondEnvelope);
}
//в параметры передать обджекты, что бы инрефейс сделать более асбтрактным