package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the budget to buy a keyboard and Drive:::");
		int budget = scan.nextInt();
		System.out.println("Enter the Keyboard options available:::");
		int keyboardOptions = scan.nextInt();
		System.out.println("Enter the Drive options available:::");
		int driveOptions = scan.nextInt();
		int keyboardPrices[] = new int[keyboardOptions];
		int drivePrices[] = new int[driveOptions];
		System.out.println("Enter the Prices of the Keyboard:::");
		for (int i = 0; i < keyboardOptions; i++) {
			keyboardPrices[i] = scan.nextInt();
		}
		System.out.println("Enter the Prices of the Drive:::");
		for (int i = 0; i < driveOptions; i++) {
			drivePrices[i] = scan.nextInt();
		}
		System.out.println(getMoneySpent(keyboardPrices, drivePrices, budget));
		scan.close();
	}

	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		List<Integer> electronics = new ArrayList<Integer>();
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= b) {
					electronics.add(keyboards[i] + drives[j]);
				}
			}
		}
		if(!electronics.isEmpty()) {
			return Collections.max(electronics);
		} else {
			return -1;
		}
	}

}
