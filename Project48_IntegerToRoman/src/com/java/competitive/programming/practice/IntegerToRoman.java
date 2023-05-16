package com.java.competitive.programming.practice;

import java.util.Scanner;

public class IntegerToRoman {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer to which you need to find the Roman number:::");
		int n = scan.nextInt();
		System.out.println("Roman Number for the Given Integer (" + n + ") is :::" + IntegerToRoman(n));
		scan.close();
	}

	public static String IntegerToRoman(int n) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (n >= values[i]) {
				n = n - values[i];
				roman.append(romanLetters[i]);
			}
		}
		return roman.toString();
	}
}
