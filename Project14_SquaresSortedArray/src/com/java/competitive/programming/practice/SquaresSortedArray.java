package com.java.competitive.programming.practice;

import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void print(int[] arr) {
        for(int k: arr) {
            System.out.print(k + "\t");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int nums1[] = {-4,-1,0,3,10};
        System.out.print("Input Array1: ");
        print(nums1);
        sortedSquares(nums1);
        System.out.print("\t Output Squares Sorted Array is: ");
        print(nums1);
        System.out.print("\n");
        int nums2[] = {-7,-3,2,3,11};
        System.out.print("Input Array2: ");
        print(nums2);
        sortedSquares(nums2);
        System.out.print("\t Output Squares Sorted Array is: ");
        print(nums2);
        System.out.print("\n");
    }
}
