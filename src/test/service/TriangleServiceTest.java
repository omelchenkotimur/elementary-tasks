package test.service;

import com.softserve.model.Triangle;
import com.softserve.service.TriangleService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

class TriangleServiceTest {

    private static TriangleService triangleService;

    @BeforeAll
    static void initialization() {
        triangleService = new TriangleService();
        System.out.println("TriangleService test started.");
    }

    @Test
    void testGetTriangleFromInput() {
        Triangle expectedTriangle = new Triangle("testTriangle", 2, 2, 2);
        Triangle actualTriangle = triangleService.buildTriangleFromString("testTriangle, 2, 2, 2");
        assertEquals("Fail to get Triangle", expectedTriangle, actualTriangle);
    }

    @Test
    void testGetTriangleFromInputExpectedIncorrectInput() {
        Assertions.assertThrows(InputMismatchException.class, () ->
                triangleService.buildTriangleFromString("testTriangle, 2, 2, 2, 2"));
    }

    @Test
    void testGetTriangleFromInputExpectedSidesMismatch() {
        Assertions.assertThrows(InputMismatchException.class, () ->
                triangleService.buildTriangleFromString("testTriangle, 2, 2, 20"));
    }


    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed.\n");
    }
}