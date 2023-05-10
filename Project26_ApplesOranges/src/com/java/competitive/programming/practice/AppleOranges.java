package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int c1 = calculateTotalDistance(apples, a, s, t);
        int c2= calculateTotalDistance(oranges, b, s, t);
        System.out.println("Total Number of Apples in Sam's House: " + c1);
        System.out.println("Total Number of Oranges in Sam's Huse: " + c2);

    }
    public static int calculateTotalDistance(List<Integer> list, int a, int s, int t) {
        int c =0;
        for(int i=0; i<list.size();i++){
            int fin = list.get(i);
            fin += a;
            if((fin >= s) && (fin <= t)){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Sam's house starting point: ");
        int s = scan.nextInt();
        System.out.print("Enter the Sam's house ending point: ");
        int t = scan.nextInt();
        System.out.print("Enter the Location for the Apple Tree: ");
        int a = scan.nextInt();
        System.out.print("Enter the Location for the Orange Tree: ");
        int b = scan.nextInt();
        System.out.print("Enter the Number of Apples: ");
        int m = scan.nextInt();
        System.out.print("Enter the Number of Oranges: ");
        int n = scan.nextInt();

        List<Integer> apples = new ArrayList<Integer>();
        List<Integer> oranges = new ArrayList<Integer>();

        System.out.print("Enter the Apples location :");
        for(int i = 0 ; i < m; i++){
            apples.add(i, scan.nextInt());
        }
        System.out.print("Enter the Oranges location :");
        for(int j = 0 ; j < n; j++){
            oranges.add(j, scan.nextInt());
        }
        countApplesAndOranges(s, t, a, b,apples, oranges);
        scan.close();
    }
}
