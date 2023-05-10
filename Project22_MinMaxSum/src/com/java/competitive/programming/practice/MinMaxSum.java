package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for(int i = 0; i < arr.size()-1; i++){
            minSum += arr.get(i);
        }
        for(int i = 1; i < arr.size(); i++){
            maxSum += arr.get(i);
        }
        System.out.print(minSum + "\t" + maxSum);
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Total number of elements for calculating the PlusMinus: ");
        int n = scan.nextInt();
        System.out.print("Enter the list of elements: ");
        List<Integer> listArray = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++) {
            listArray.add(scan.nextInt());
        }
        miniMaxSum(listArray);
        scan.close();
    }
}
