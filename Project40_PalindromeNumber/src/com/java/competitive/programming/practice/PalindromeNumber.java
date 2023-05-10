package com.java.competitive.programming.practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static String palindromeNumber(int num) {
        String output = null;
        int rem;
        int sum = 0;
        int temp = num;
        while ( num > 0 ) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if(temp == sum) {
            output = temp + " is a Palindrome number";
        } else {
            output = temp + " is not a palindrome number";
        }
        return output;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to find the Palindrome for:");
        int num = scan.nextInt();
        String result = palindromeNumber(num);
        System.out.println(result);
        scan.close();
    }
}
