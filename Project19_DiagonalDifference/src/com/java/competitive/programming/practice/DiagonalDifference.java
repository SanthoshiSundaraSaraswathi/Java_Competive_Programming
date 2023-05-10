package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr.size();i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - (i+1));
        }
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
	// write your code here
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(7,8,11));
        int result = diagonalDifference(arr);
        System.out.print(result);
    }
}
