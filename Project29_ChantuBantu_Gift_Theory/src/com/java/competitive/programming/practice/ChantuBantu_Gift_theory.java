package com.java.competitive.programming.practice;

import java.util.*;

public class ChantuBantu_Gift_theory {
    public static void calculate(List<TestCase> test){
        for(TestCase t : test) {
            Collections.sort(t.getGifts());
            long sum = 0;
            for (int i = 0; i < t.getNoOfGifts(); i++){
                sum += t.getGifts().get(i);
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Total number of persons to whom we need to calculate: ");
        int testCase = scan.nextInt();
        List<TestCase> test = new ArrayList<TestCase>();
        for(int i = 0; i < testCase ; i++) {
            System.out.println("Enter the total number of gifts does case" + i+1 + " wants to buy: ");
            int noOfGifts = scan.nextInt();
            System.out.println("Enter the total gift options available for the case" + i+1 + ": ");
            int totalGiftCount = scan.nextInt();
            System.out.println("Enter the Amount for the Gift options available: ");
            List<Integer> gifts = new ArrayList<Integer>();
            for(int j = 0; j < totalGiftCount; j++){
                gifts.add(scan.nextInt());
            }
            TestCase t = new TestCase(noOfGifts, totalGiftCount, gifts);
            test.add(t);
        }
        calculate(test);
        scan.close();
    }
}


class TestCase {
    int noOfGifts;
    int totalGiftCount;
    List<Integer> gifts = new ArrayList<Integer>();

    public int getNoOfGifts() {
        return noOfGifts;
    }

    public void setNoOfGifts(int noOfGifts) {
        this.noOfGifts = noOfGifts;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "noOfGifts=" + noOfGifts +
                ", totalGiftCount=" + totalGiftCount +
                ", gifts=" + gifts +
                '}';
    }

    public TestCase(int noOfGifts, int totalGiftCount, List<Integer> gifts) {
        this.noOfGifts = noOfGifts;
        this.totalGiftCount = totalGiftCount;
        this.gifts = gifts;
    }

    public int getTotalGiftCount() {
        return totalGiftCount;
    }

    public void setTotalGiftCount(int totalGiftCount) {
        this.totalGiftCount = totalGiftCount;
    }

    public List<Integer> getGifts() {
        return gifts;
    }

    public void setGifts(List<Integer> gifts) {
        this.gifts = gifts;
    }
}
