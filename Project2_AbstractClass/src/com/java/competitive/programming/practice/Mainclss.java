package com.java.competitive.programming.practice;

public class Mainclss {
    public Mainclss() {
    }

    public static void main(String[] args) {
        new SelfFinance();
        Aided aided = new Aided();
        String test2 = aided.result("67 4,34 2,54 5,100 2|1,100,5|0,100,5");
        System.out.println(test2);
        System.out.println(test2.hashCode());
        String sample = "7.06";
        System.out.println(sample.hashCode());
    }
}
