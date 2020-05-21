package test.service;

import com.softserve.service.LuckyTicketService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class LuckyTicketServiceTest {

    private static LuckyTicketService luckyTicketService;

    @BeforeAll
    static void initialization() {
        luckyTicketService = new LuckyTicketService();
        System.out.println("LuckyTicketService test started.");
    }

    @Test
    void testCountMoscowType() {
        int expectedResult = 55252;
        int actualResult = luckyTicketService.count(999999, "moscow");
        assertEquals("Fail to count Moscow type tickets", expectedResult, actualResult);
    }

    @Test
    void testCountPiterType() {
        int expectedResult = 55252;
        int actualResult = luckyTicketService.count(999999, "piter");
        assertEquals("Fail to count Moscow type tickets", expectedResult, actualResult);
    }

    @Test
    void testCountThrowsIllegalArgumentExceptionWhenTypeIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                luckyTicketService.count(999999, "test"));
    }

    @Test
    void testCountThrowsIllegalArgumentExceptionWhenValueIsOddNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                luckyTicketService.count(9999999, "moscow"));
    }

    @Test
    void testCountThrowsIllegalArgumentExceptionWhenValueBiggerThenEightDigits() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                luckyTicketService.count(1234567890, "moscow"));
    }

    @Test
    void testFormatTicketNumberFromInput() {
        int expectedResult = 1;
        int actualResult = luckyTicketService.count(10, "moscow");
        assertEquals("Fail to format ticket number from input", expectedResult, actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed.\n");
    }
}