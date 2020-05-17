package test.service;

import com.softserve.service.LuckyTicketService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LuckyTicketServiceTest {

    private static LuckyTicketService luckyTicketService;

    @BeforeAll
    static void initialization() {
        luckyTicketService = new LuckyTicketService();
        System.out.println("LuckyTicketService test start");
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
    void testCount() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                luckyTicketService.count(999999, "test"));
    }

    @Test
    void testFormatTicketNumberFromInput() {
        int expectedResult = 1;
        int actualResult = luckyTicketService.count(10, "moscow");
        assertEquals("Fail to format ticket number from input", expectedResult, actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed");
    }
}