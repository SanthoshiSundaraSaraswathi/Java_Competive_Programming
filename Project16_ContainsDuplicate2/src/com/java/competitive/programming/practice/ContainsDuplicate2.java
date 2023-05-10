package com.java.competitive.programming.practice;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i-pre<=k)
                    return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
    public static void print(int[] nums){
        for(int k : nums){
            System.out.print(k + "\t");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int nums1[] = {1,2,3,1};
        int nums2[] = {1,0,1,1};
        int nums3[] = {1,2,3,1,2,3};
        boolean nums1Result = containsNearbyDuplicate(nums1, 3);
        boolean nums2Result = containsNearbyDuplicate(nums2, 1);
        boolean nums3Result = containsNearbyDuplicate(nums3, 2);
        System.out.print("Input Array: ");
        print(nums1);
        System.out.print(" Contains Duplication to the nearest position 3: " + nums1Result + "\n");

        System.out.print("Input Array: ");
        print(nums2);
        System.out.print(" Contains Duplication to the nearest position 1: " + nums2Result + "\n");

        System.out.print("Input Array: ");
        print(nums3);
        System.out.print(" Contains Duplication to the nearest position 2: " + nums3Result + "\n");
    }
}
