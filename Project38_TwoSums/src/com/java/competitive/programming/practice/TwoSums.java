package com.java.competitive.programming.practice;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {

        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {
	// write your code here
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the total number of input elements: ");
            int size = scan.nextInt();
            int[] nums = new int[size];
            System.out.print("Enter the input elements: ");
            for(int i = 0 ; i < size; i++){
                nums[i] = scan.nextInt();
            }
            System.out.print("Enter the target: ");
            int target = scan.nextInt();
            int[] result = twoSum(nums, target);
            System.out.print("Output: ");
            for(int i = 0 ; i < result.length; i++){
                System.out.print(result[i]);
            }
            scan.close();
        }
    }

