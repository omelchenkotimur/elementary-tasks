package com.softserve.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileProcessingUtilities {

    public static String readFileIntoString(String filePath) {
        String result = null;
        try {
            result = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
        return result;
    }

    public static void updateFileWithString(String filePath, String value) {
        try {
            Files.write(Paths.get(filePath), value.getBytes());
        } catch (InvalidPathException pathException) {
            System.out.println("Invalid path.");
        } catch (IOException ioException) {
            System.out.println("File not found.");
        }
    }

}


