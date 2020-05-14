package test.service;

import com.softserve.service.FileParserService;
import com.softserve.util.Util;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

class FileParserServiceTest {

    private static final String FILE_PATH = "C:\\Development\\elementary-tasks\\src\\test\\service\\resources\\test";
    private static final String STRING_TO_SEARCH = "a";
    private static FileParserService fileParserService;


    @BeforeAll
    static void initialization() {
        fileParserService = new FileParserService();
        fileParserService.setFilePath(FILE_PATH);
        System.out.println("FileParserService test start");

    }

    @BeforeEach
    void beforeEach() throws IOException {
        Files.createFile(Paths.get(FILE_PATH));
        Files.write(Paths.get(FILE_PATH), "Aaa Bbb Ccc".getBytes());
    }

    @AfterEach
    void afterEach () throws IOException {
        Files.deleteIfExists(Paths.get(FILE_PATH));
    }

    @Test
    void testFindStringAndCount() {
        int expectedCounter = 2;
        int actualCounter = fileParserService.findStringAndCount(STRING_TO_SEARCH);
        assertEquals("Counter error!", expectedCounter, actualCounter);
    }

    @Test
    void testFindStringAndReplace() {
        String expectedResult = "Abb Bbb Ccc";
        String replace = "b";
        fileParserService.findStringAndReplace(STRING_TO_SEARCH, replace);
        String actualResult = Util.readFileIntoString(FILE_PATH);
        assertEquals("Replace error!", expectedResult, actualResult);
    }

    @AfterAll
    static void onComplete() {
        System.out.println("Testing successfully completed");
    }
}