package com.infy.java8streamapiex.singaltonclass;

public class SingaltonTest {
    public static void main(String[] args) {
        // Printer printer = new Printer();
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        System.out.println(p1);
        System.out.println(p2);
    }
}
