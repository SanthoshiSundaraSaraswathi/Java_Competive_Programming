package com.java.competitive.programming.practice;

public class FindEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            int digit = (int)Math.floor(Math.log10(nums[i])+1);
            if(digit%2 == 0){
                c++;
            }
        }
        return c;
    }

    public static void print(int[] arr){
        for(int k: arr){
            System.out.print(k + "\t");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int nums1[] = {12,345,2,6,7896};
        int nums2[] = {555,901,482,1771};
        int nums1Result = findNumbers(nums1);
        int nums2Result = findNumbers(nums2);
        System.out.print("Input Array1: " );
        print(nums1);
        System.out.print("\t Output for finding the count of Even Number of Digits : " + nums1Result + "\n");
        System.out.print("Input Array2: " );
        print(nums2);
        System.out.print("\t Output for finding the count of Even Number of Digits : " + nums2Result + "\n");
    }
}
