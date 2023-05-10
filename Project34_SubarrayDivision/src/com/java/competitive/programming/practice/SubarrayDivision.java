package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        if(m > s.size()){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < m - 1; i++) {
            sum += s.get(i);
        }
        for(int j = m-1; j < s.size(); j++){
            sum -= (j-m) < 0 ? 0 : s.get(j-m);
            sum += s.get(j);
            if(sum==d)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements to be input: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements: ");
        List<Integer> s = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            s.add(i, scan.nextInt());
        }
        System.out.println("Enter the date: ");
        int d = scan.nextInt();
        System.out.println("Enter the month: ");
        int m = scan.nextInt();
        int result = birthday(s, d, m);
        System.out.println("Number of ways the bar can be divided: " + result);
        scan.close();
    }
}
