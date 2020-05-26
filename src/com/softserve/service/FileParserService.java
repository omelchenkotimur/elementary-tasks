package com.softserve.service;

import com.softserve.util.FileProcessingUtilities;

public class FileParserService {

    private String filePath;

    public FileParserService() {
    }

    public int findStringAndCount(String search) throws NullPointerException {
        String result = FileProcessingUtilities.readFileIntoString(filePath).replaceAll(search, "");
        return (FileProcessingUtilities.readFileIntoString(filePath).length() - result.length()) / search.length();
    }

    public void findStringAndReplace(String search, String replace) throws NullPointerException {
        String result = FileProcessingUtilities.readFileIntoString(filePath).replaceAll(search, replace);
        FileProcessingUtilities.updateFileWithString(filePath, result);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
