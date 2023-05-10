package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            boolean ok = true;
            for(int j = 0; (j < a.size()) && (ok); j++) {
                if (i % a.get(j) != 0) {
                    ok = false;
                }
            }
            for (int j = 0; (j < b.size()) && (ok); j++) {
                if (b.get(j) % i != 0) {
                    ok = false;
                }
            }
            if (ok) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of elements in 1st list: ");
        int m = scan.nextInt();
        System.out.println("Enter the total number of elements in 2nd list: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements for the 1st list: ");
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            a.add(i, scan.nextInt());
        }
        System.out.println("Enter the elements for the 2nd list: ");
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            b.add(i, scan.nextInt());
        }
        int num = getTotalX(a,b);
        System.out.println("Number of integers between the 2 sets that are foctors: " + num);
        scan.close();
    }
}
