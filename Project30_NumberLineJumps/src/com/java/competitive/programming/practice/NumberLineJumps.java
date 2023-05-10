package com.java.competitive.programming.practice;

import java.util.Scanner;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int vdiff = v1 - v2;
        int xdiff = x1 - x2;
        if (vdiff <= 0) {
            return "NO";
        }
        return xdiff % vdiff == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {

	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Start distance for the first Kangroo: ");
        int x1 = scan.nextInt();
        System.out.println("Please enter the End distance for the first Kangroo: ");
        int v1 = scan.nextInt();
        System.out.println("Please enter the Start distance for the Second Kangroo: ");
        int x2 = scan.nextInt();
        System.out.println("Please enter the End distance for the Second Kangroo: ");
        int v2 = scan.nextInt();
        String output = kangaroo(x1, v1, x2, v2);
        System.out.println("Will the 2 Kangroo's meet :" + output);
        scan.close();
    }
}
