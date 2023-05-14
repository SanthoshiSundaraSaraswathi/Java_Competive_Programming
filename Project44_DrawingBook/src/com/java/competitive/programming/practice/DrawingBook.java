package com.java.competitive.programming.practice;

import java.util.Scanner;

public class DrawingBook {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total number of Pages:");
		int n = scan.nextInt();
		System.out.println("Enter the page to be turned:");
		int p = scan.nextInt();
		int result = pageCount(n, p);
		System.out.println("Minimun number of turns required either from Front/Back:::" + result);
		scan.close();
	}

	public static int pageCount(int n, int p) {
		// Write your code here
		int frontdist = p / 2;
		int backdist = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
		return Math.min(frontdist, backdist);

	}

}
