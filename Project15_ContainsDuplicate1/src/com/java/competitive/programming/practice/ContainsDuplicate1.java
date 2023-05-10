package com.java.competitive.programming.practice;

import java.util.Arrays;

public class ContainsDuplicate1 {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int j=1; j<nums.length; j++){
            if(nums[j-1] == nums[j]){
                return true;
            }
        }
        return false;
    }
    public static void print(int[] nums){
        for(int k: nums){
            System.out.print(k+"\t");
        }
    }

    public static void main(String[] args) {
	// write your code here
        int nums1[] = {1,2,3,1};
        int nums2[] = {1,2,3,4};
        int nums3[] = {1,2,1,3,4,5,1};
        boolean nums1Result = containsDuplicate(nums1);
        boolean nums2Result = containsDuplicate(nums2);
        boolean nums3Result = containsDuplicate(nums3);
        System.out.print("Input Array 1 : ");
        print(nums1);
        System.out.print(" Contains the Duplicate values: " + nums1Result + "\n");
        System.out.print("Input Array 2 : ");
        print(nums2);
        System.out.print(" Contains the Duplicate values: " + nums2Result + "\n");
        System.out.print("Input Array 3 : ");
        print(nums3);
        System.out.print(" Contains the Duplicate values: " + nums3Result + "\n");

    }
}
