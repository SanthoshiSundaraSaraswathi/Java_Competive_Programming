package com.java.competitive.programming.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0L;
        for(long k: ar){
            sum += k;
        }
        return sum;
    }

}

public class AVeryBigSum {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Total Number of Long Integers to be input: ");
        int count = scan.nextInt();
        List<Long> ar = new ArrayList<Long>();
        System.out.println("Please enter the Long values: ");
        for(int i = 0; i < count ; i++ ) {
            ar.add(scan.nextLong());
        }
        long result = Result.aVeryBigSum(ar);
        System.out.println("A very Big Sum: " + result);
        scan.close();
    }
}
