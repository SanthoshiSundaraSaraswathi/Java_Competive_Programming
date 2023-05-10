package com.java.competitive.programming.practice;

public class FactorialLoop {

    public static void main(String[] args) {
	// write your code here
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
