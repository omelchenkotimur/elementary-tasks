package test.service;

import com.softserve.service.NumberInWordsService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class NumberInWordsServiceTest {

    private static NumberInWordsService numberInWordsService;

    @BeforeAll
    static void initialization() {
        numberInWordsService = new NumberInWordsService();
        System.out.println("NumberInWords test started");
    }

    @Test
    void testNumberInWords() {
        String expectedResult = "one hundred twenty-three million four hundred fifty-six thousand seven hundred eighty-nine";
        String actualResult = numberInWordsService.numberInWords(123456789);
        assertEquals("Fail to get number in words!", expectedResult, actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed\n");
    }
}