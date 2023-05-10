package com.java.competitive.programming.practice;

import java.util.Scanner;

public class ExamCenter {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int ans = 1;
        while (ans <= n) {
            String str = String.valueOf(i);
            if (!str.contains("2") && !str.contains("14")) {
                ans++;
            }
            i++;
        }
        System.out.println(i - 1);
        sc.close();
    }
}
