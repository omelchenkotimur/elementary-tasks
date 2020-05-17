package test.service;

import com.softserve.service.SimpleNumberCountService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleNumberCountServiceTest {

    private static SimpleNumberCountService simpleNumberCountService;

    @BeforeAll
    static void initialization() {
        simpleNumberCountService = new SimpleNumberCountService();
        System.out.println("SimpleNumberCountService test start");
    }

    @Test
    void testSimpleNumberCountWhichSquareLessThenInput(){
        List<Integer> expectedResult = Arrays.asList(2, 3, 5, 7);
        ArrayList actualResult = simpleNumberCountService.simpleNumberCountWhichSquareLessThenInput(100);
        assertEquals("Fail to count simple numbers!",expectedResult,actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed");
    }
}