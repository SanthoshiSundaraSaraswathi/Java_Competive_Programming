package com.java.competitive.programming.practice;

import java.util.Scanner;

public class CatAndAMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Position of the Cat A:::");
		int a = scan.nextInt();
		System.out.println("Enter the Position of the Cat B:::");
		int b = scan.nextInt();
		System.out.println("Enter the Position of the Mouse C:::");
		int c = scan.nextInt();
		System.out.println(catAndMouse(a,b,c));
		scan.close();
	}
	 static String catAndMouse(int x, int y, int z) {
		 int a = x > z ? x-z : z-x;
		 int b = y > z ? y-z : z-y;
		 if(a<b) {
			 return "Cat A";
		 } else if(a>b) {
			 return "Cat B";
		 } else {
			 return "Mouse C";
		 }
    }

}
