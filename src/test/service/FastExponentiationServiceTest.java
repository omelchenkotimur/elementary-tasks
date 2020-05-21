package test.service;

import com.softserve.service.FastExponentiationService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class FastExponentiationServiceTest {

    private static FastExponentiationService fastExponentiationService;

    @BeforeAll
    static void initialization() {
        fastExponentiationService = new FastExponentiationService();
        System.out.println("FastExponentiationService test started");
    }

    @Test
    void testFastExponentiationService() {
        long expectedResult = 8;
        long actualResult = fastExponentiationService.binaryPower(2, 3);
        assertEquals("Fail to raise a number to a power!", expectedResult, actualResult);
    }

    @Test
    void testFastExponentiationServiceWhenNumberLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fastExponentiationService.binaryPower(-2, 2));
    }

    @Test
    void testFastExponentiationServiceWhenPowerLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fastExponentiationService.binaryPower(2, -2));
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed\n");
    }
}