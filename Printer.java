package com.infy.java8streamapiex.singaltonclass;

public class Printer {
    // step-2
    private static Printer INSTANCE;

    // step-1
    private Printer() {
        System.out.println("No Arg Constructer");
    }

    // step-3
    public static Printer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Printer();
            // return INSTANCE;
        }
        return INSTANCE;
    }

}
