package com.java.competitive.programming.practice;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int zero = 0;
        for (int i: arr) {
            if (i == 0) {
                zero++;
            }
        }
        int i = arr.length - 1;
        int j = arr.length + zero - 1;
        while (i != j) {
            insert (arr, i, j--);
            if (arr[i] == 0) {
                insert (arr, i, j--);
            }
            i--;
        }
        print(arr);
    }

    private static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
    public static void print(int[] arr){
        for(int i: arr)
            System.out.print(i);
    }
    public static void main(String[] args) {
	// write your code here
        int arr1[] = {1,0,2,3,0,4,5,0};
        print(arr1);
        System.out.println("\n");
        duplicateZeros(arr1);
        System.out.println("\n");
        int arr2[] = {1,2,3};
        print(arr2);
        System.out.println("\n");
        duplicateZeros(arr2);
        System.out.println("\n");
    }
}
