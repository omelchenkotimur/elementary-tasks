package com.softserve.handler;

import com.softserve.service.FileParserService;
import com.softserve.util.Util;

public class FileParserHandler {

    private FileParserService fileParserService;

    public FileParserHandler(FileParserService fileParserService) {
        this.fileParserService = fileParserService;
    }

    public void handle() {

        System.out.println("Choose the task mode:\n" +
                "1. Count number of strings in the text.\n" +
                "2. Found and replace strings in the text.");
        int input = Util.getPositiveInt();
        if (input == 1) {
            System.out.println("Enter filepath.");
            fileParserService.setFilePath(Util.getString());
            System.out.println("Enter string to find.");
            String stringToFind = Util.getString();
            try {
                System.out.println(fileParserService.findStringAndCount(stringToFind));
            } catch (NullPointerException unhandled) {
//message "не нашел"
            }
        } else if (input == 2) {
            System.out.println("Enter filepath.");
            fileParserService.setFilePath(Util.getString());
            System.out.println("Enter string to find.");
            String stringToFind = Util.getString();
            System.out.println("Enter string to replace.");
            String stringReplaceTo = Util.getString();
            try {
                fileParserService.findStringAndReplace(stringToFind, stringReplaceTo);
                System.out.println(Util.readFileIntoString(fileParserService.getFilePath()));
            } catch (NullPointerException unhandled) {

            }
        } else {
            System.out.println("Incorrect input.");
        }
    }
}
