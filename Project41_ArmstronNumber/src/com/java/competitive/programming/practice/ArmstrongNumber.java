package com.java.competitive.programming.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static String armstrongNumber(int num) {

		String output = null;
		int temp = num;
		int digits = 0;
		int last = 0;
		int sum = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (num == sum) {
			output = num + " is an Armstrong Number";
		} else {
			output = num + " is not an Armstrong Number";
		}
		return output;
	}

	public static void main(String[] args) {
		// write your code here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find weather it is an Armstrong number or not:");
		int num = scan.nextInt();
		String result = armstrongNumber(num);
		System.out.println(result);
		scan.close();
	}
}
