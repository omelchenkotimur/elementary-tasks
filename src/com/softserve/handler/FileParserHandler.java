package com.softserve.handler;

import com.softserve.service.FileParserService;
import com.softserve.util.ConsoleUtilties;
import com.softserve.util.FileProcessingUtilities;

public class FileParserHandler {

    private FileParserService fileParserService;

    public FileParserHandler(FileParserService fileParserService) {
        this.fileParserService = fileParserService;
    }

    public void handle() {

        System.out.println("Choose the task mode:\n" +
                "1. Count number of strings in the text.\n" +
                "2. Found and replace strings in the text.");
        int input = ConsoleUtilties.getPositiveInt();
        if (input == 1) {
            System.out.println("Enter filepath.");
            fileParserService.setFilePath(ConsoleUtilties.getString());
            System.out.println("Enter string to find.");
            String stringToFind = ConsoleUtilties.getString();
            try {
                System.out.println(fileParserService.findStringAndCount(stringToFind));
            } catch (NullPointerException unhandled) {
                throw new NullPointerException("File not found!");
            }
        } else if (input == 2) {
            System.out.println("Enter filepath.");
            fileParserService.setFilePath(ConsoleUtilties.getString());
            System.out.println("Enter string to find.");
            String stringToFind = ConsoleUtilties.getString();
            System.out.println("Enter string to replace.");
            String stringReplaceTo = ConsoleUtilties.getString();
            try {
                fileParserService.findStringAndReplace(stringToFind, stringReplaceTo);
                System.out.println(FileProcessingUtilities.readFileIntoString(fileParserService.getFilePath()));
            } catch (NullPointerException unhandled) {
                throw new NullPointerException("File not found!");
            }
        } else {
            System.out.println("Incorrect input.");
        }
    }
}
