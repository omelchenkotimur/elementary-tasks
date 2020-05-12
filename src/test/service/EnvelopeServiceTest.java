package test.service;

import com.softserve.model.Envelope;
import com.softserve.service.EnvelopeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class EnvelopeServiceTest {

    private static EnvelopeService envelopeService;

    @BeforeAll
    static void initialization() {
        envelopeService = new EnvelopeService();
        System.out.println("EnvelopeService test start");
    }

    @Test
    void testCompareFirstIntoSecond() {
        Envelope envelopeFirst = new Envelope(1.0, 1.0);
        Envelope envelopeSecond = new Envelope(2.0, 2.0);
        int actualResult = envelopeService.compare(envelopeFirst, envelopeSecond);
        int expectedResult = -1;
        assertEquals("Wrong comparison", expectedResult, actualResult);
    }

    @Test
    void testCompareSecondIntoFirst() {
        Envelope envelopeFirst = new Envelope(2.0, 2.0);
        Envelope envelopeSecond = new Envelope(1.0, 1.0);
        int actualResult = envelopeService.compare(envelopeFirst, envelopeSecond);
        int expectedResult = 1;
        assertEquals("Wrong comparison", expectedResult, actualResult);
    }

    @Test
    void testCompareIncompatibleEnvelopes() {
        Envelope envelopeFirst = new Envelope(1.0, 2.0);
        Envelope envelopeSecond = new Envelope(2.0, 1.0);
        int actualResult = envelopeService.compare(envelopeFirst, envelopeSecond);
        int expectedResult = 0;
        assertEquals("Wrong comparison", expectedResult, actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed");
    }
}