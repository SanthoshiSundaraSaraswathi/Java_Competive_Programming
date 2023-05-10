package com.java.competitive.programming.practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static String primeNumber(int number){
        int flag = 0;
        int m = 3;
        String output = null;
        if(number < 0){
            output = "Please enter the positive numbers";
        } else if(number == 0 || number == 1){
            output =  "Number is not a prime number";
        } else {
            for(int i = 2 ; i <= m; i++){
                if(number % i == 0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                output =  "Provided number is a Prime Number";
            } else {
               output = "Provided number is not a Prime Number";
            }
        }
        return output;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the element to find prime or not:");
        int number = scan.nextInt();
        String result = primeNumber(number);
        System.out.println(result);
        scan.close();
    }
}
