package test.service;

import com.softserve.service.FibonacciNumbersService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

class FibonacciNumbersServiceTest {

    private static FibonacciNumbersService fibonacciNumbersService;

    @BeforeAll
    static void initialization() {
        fibonacciNumbersService = new FibonacciNumbersService();
        System.out.println("FibonacciNumbersService test started.");
    }

    @Test
    void getFibonacciNumbersFromRange() {
        List<Integer> expectedFibonacciNumbersList = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        ArrayList actualFibonacciNumbersList = fibonacciNumbersService.getFibonacciNumbersFromRange(0, 100);
        assertEquals("Fail to get Fibonacci numbers from range!", expectedFibonacciNumbersList, actualFibonacciNumbersList);
    }

    @Test
    void testValidateInputRangeWhenInitialValueLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumbersService.getFibonacciNumbersFromRange(-1, 100));
    }

    @Test
    void testValidateWhenFinalValueLessZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumbersService.getFibonacciNumbersFromRange(100, -1));
    }

    @Test
    void testValidateWhenFinalValueLessInitialValue() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                fibonacciNumbersService.getFibonacciNumbersFromRange(100, 0));
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed.\n");
    }
}