package com.java.competitive.programming.practice;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0, max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public static void print(int[] arr) {
        for(int k: arr) {
            System.out.print(k);
        }
    }
    public static void main(String[] args) {
	// write your code here
        int nums1[] = {1,1,0,1,1,1};
        int nums2[] = {1,0,1,1,0,1};
        int nums3[] = {1,1,1,1,1,1};
        int nums4[] = {1,0,1,1,1,1};
        int nums1Result = findMaxConsecutiveOnes(nums1);
        int nums2Result = findMaxConsecutiveOnes(nums2);
        int nums3Result = findMaxConsecutiveOnes(nums3);
        int nums4Result = findMaxConsecutiveOnes(nums4);
        System.out.print("Input Array1 : ");
        print(nums1);
        System.out.print("\t Output Array1 : " + nums1Result + "\n");
        System.out.print("Input Array2 : ");
        print(nums2);
        System.out.print("\t Output Array2 : " + nums2Result + "\n");
        System.out.print("Input Array3 : ");
        print(nums3);
        System.out.print("\t Output Array3 : " + nums3Result + "\n");
        System.out.print("Input Array4 : ");
        print(nums4);
        System.out.print("\t Output Array4 : " + nums4Result + "\n");
    }
}
