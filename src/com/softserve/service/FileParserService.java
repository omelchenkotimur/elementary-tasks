package com.softserve.service;

import com.softserve.util.Util;

public class FileParserService {

    private String filePath;

    public FileParserService() {
    }

    public int findStringAndCount(String search) throws NullPointerException {
        String result = Util.readFileIntoString(filePath).replaceAll(search, "");
        return (Util.readFileIntoString(filePath).length() - result.length()) / search.length();
    }

    public void findStringAndReplace(String search, String replace) throws NullPointerException {
        String result = Util.readFileIntoString(filePath).replaceAll(search, replace);
        Util.updateFileWithString(filePath, result);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
