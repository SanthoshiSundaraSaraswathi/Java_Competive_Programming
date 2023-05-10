package com.java.competitive.programming.practice;

import java.util.Scanner;

public class FibonacciSeriesRecursionUserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int limit;
        System.out.println("Enter how many Fibonacci number to print");
        limit = keyboard.nextInt();

        System.out.println("The first " + limit + " Fibonacci numbers are:");
        for (int i=0; i < limit; i++){
            System.out.print(fibonacci(i) + " ");
        }
        keyboard.close();
    }

    public static int fibonacci(int num) {

        if (num == 0) {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }
}
