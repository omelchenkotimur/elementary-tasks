package test.service;

import com.softserve.service.FibonachiNumbersService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

class FibonachiNumbersServiceTest {

    private static FibonachiNumbersService fibonachiNumbersService;

    @BeforeAll
    static void initialization() {
        fibonachiNumbersService = new FibonachiNumbersService();
        System.out.println("FibonachiNumbersService test start.");
    }

    @Test
    void testFibonachiNumbersService(){
        List<Integer> expectedlistFibonachiNumbers = Arrays.asList(1,1,2,3,5,8,13,21,34,55,89);
        ArrayList actuallistFibonachiNumbers = fibonachiNumbersService.getFibonachiNumbersFromRange(0,100);
        assertEquals("Fail to get Fibonachi numbers from range!", expectedlistFibonachiNumbers,actuallistFibonachiNumbers);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed.");
    }
}