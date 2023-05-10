package com.java.competitive.programming.practice;

import java.util.Scanner;

public class FactorialLoopUserInput {

    public static void main(String[] args) {
	// write your code here
        int i,fact=1;
        try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the Number to find the Factorial for: ");
			int number=scan.nextInt();//It is the number to calculate factorial
			for(i=1;i<=number;i++){
			    fact=fact*i;
			}
			System.out.println("Factorial of "+number+" is: "+fact);
			scan.close();
		}
    }
}
