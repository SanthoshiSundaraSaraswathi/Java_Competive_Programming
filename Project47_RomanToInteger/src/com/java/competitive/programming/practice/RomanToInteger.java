package com.java.competitive.programming.practice;

import java.util.Scanner;

public class RomanToInteger {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Roman number for which Integer needs to be converted:::");
		String s = scan.next();
		System.out.println("The converted Integer for the Roman number (" + s + ") is:::" + RomanToInteger(s) );
		scan.close();
	}

	public static int Value(char r) {
		if (r == 'I') {
			return 1;
		}
		if (r == 'V') {
			return 5;
		}
		if (r == 'X') {
			return 10;
		}
		if (r == 'L') {
			return 50;
		}
		if (r == 'C') {
			return 100;
		}
		if (r == 'D') {
			return 500;
		}
		if (r == 'M') {
			return 1000;
		}
		return -1;
	}

	public static int RomanToInteger(String s) {
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int s1 = Value(s.charAt(i));
			if (i + 1 < s.length()) {
				int s2 = Value(s.charAt(i + 1));
				if (s1 >= s2) {
					total = total + s1;
				} else {
					total = total - s1;
				}
			} else {
				total = total + s1;
			}
		}
		return total;
	}
}
