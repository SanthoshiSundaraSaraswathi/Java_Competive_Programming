package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxCount = 0;
        int minCount = 0;
        int currentMaxScore = scores.get(0);
        int currentMinScore = scores.get(0);
        List<Integer> recordBreak = new ArrayList<Integer>();
        for (int  i = 1; i < scores.size(); i++) {
            if (scores.get(i) > currentMaxScore) {
                currentMaxScore = scores.get(i);
                maxCount++;
            }
            if (scores.get(i) < currentMinScore) {
                currentMinScore = scores.get(i);
                minCount++;
            }
        }
        recordBreak.add(0, maxCount);
        recordBreak.add(1, minCount);
        return recordBreak;
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of scores: ");
        int c = scan.nextInt();
        System.out.println("Enter the scores: ");
        List<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < c; i++) {
            scores.add(i, scan.nextInt());
        }
        List<Integer> result = breakingRecords(scores);
        System.out.println("Max Score was attained " + result.get(0) + " times");
        System.out.println("Min Score was attained " + result.get(1) + " times");
    }
}
