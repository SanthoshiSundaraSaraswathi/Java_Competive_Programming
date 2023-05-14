package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of food that Anna and Brian had:");
		int noOfItems = scan.nextInt();
		System.out.println("Enter the Price of the Items:");
		List<Integer> price = new ArrayList<Integer>();
		for (int i = 0; i < noOfItems; i++) {
			price.add(scan.nextInt());
		}
		System.out.println("Enter the food item which Anna didnt have:");
		int skipped = scan.nextInt();
		System.out.println("Enter the price actually charged:");
		int charged = scan.nextInt();
		bonAppetit(price, skipped, charged);
		scan.close();
	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// Write your code here
		bill.remove(k);
		int actual = bill.stream().reduce(0, (a, c) -> a + c);
		int actualCharged = actual / 2;
		if (b - actualCharged == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - actualCharged);
		}

	}

}
