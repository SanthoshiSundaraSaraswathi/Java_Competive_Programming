package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = Collections.max(candles);
        int count = 0;
        for(int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == max) {
                count++;
            }
        }
        return count;
    }
    @SuppressWarnings("resource")
	public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Total number of elements : ");
        int n = scan.nextInt();
        System.out.print("Enter the list of elements: ");
        List<Integer> listArray = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++) {
            listArray.add(scan.nextInt());
        }
        int result = birthdayCakeCandles(listArray);
        System.out.print("Total number of Taller candles available are :" + result);
    }
}
