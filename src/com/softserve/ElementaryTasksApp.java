package com.softserve;

import com.softserve.util.Util;

public class ElementaryTasksApp {

    public static void main(String[] args) {

        boolean shouldContinue = true;
        while (shouldContinue) {
            ElementaryTasksRunner.run();
            shouldContinue = Util.confirmation("Return to main menu? Yes/No");
        }
    }
}


