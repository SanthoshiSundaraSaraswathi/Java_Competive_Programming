package com.java.competitive.programming.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> resultGrades = new ArrayList<Integer>();
        for(int i = 0; i < grades.size(); i++) {
            if(grades.get(i) < 38) {
                resultGrades.add(i, grades.get(i));
            } else {
                int f1 = grades.get(i) + 1;
                int f2 = grades.get(i) + 2;
                if (f1 % 5 == 0) {
                    resultGrades.add(i, f1);
                } else if (f2 % 5 == 0) {
                    resultGrades.add(i, f2);
                } else {
                    resultGrades.add(i, grades.get(i));
                }
            }
        }
        return resultGrades;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Total number of elements for Grading: ");
        int n = scan.nextInt();
        System.out.print("Enter the list of elements: ");
        List<Integer> listArray = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++) {
            listArray.add(scan.nextInt());
        }
        List<Integer> result = gradingStudents(listArray);
        System.out.println("Grades after adjusting:");
        for(int j = 0; j < n ; j++) {
            System.out.print(result.get(j) + " ");
        }
        scan.close();
    }
}
