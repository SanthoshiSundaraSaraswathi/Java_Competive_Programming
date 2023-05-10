package com.java.competitive.programming.practice;

import java.util.Scanner;

public class FactorialRecursionUserInput {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int fact=1;
        System.out.print("Please enter the number to which factorial has to be calculated for: ");
        int number=scan.nextInt();//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
        scan.close();
    }
}
