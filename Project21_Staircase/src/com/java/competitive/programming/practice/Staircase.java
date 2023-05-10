package com.java.competitive.programming.practice;

import java.util.Scanner;

public class Staircase {
    //Left Staircase
    public static void leftStaircase(int n) {
        System.out.println("Left Staircase Pattern:");
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if(row >= col)
                    System.out.print("*");
            }
            // Display in a new line
            System.out.println();
        }
    }
    //Right Staircase
    public static void rightStaircase(int n) {
        System.out.println("Right Staircase Pattern:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col < n - row - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            // Display in a new line
            System.out.println();
        }
    }
    //Staircase pattern
    public static void staircase(int n) {
        System.out.println("Real Staircase Pattern:");
        int k = 0;
        for (int i = 0; i <= n; i++) {
            // Check whether value of i is even or not
            if (i % 2 != 0)
                k = i + 1;
            else
                k = i;
            for (int j = 0; j < k; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    //Pyramid pattern
    public static void pyramid(int n) {
        // outer loop to handle number of rows
        //  n in this case
        System.out.println("Pyramid Pattern:");
        for (int i=0; i<n; i++)
        {
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }
    }
    //Reverse Pyramid Pattern
    public static void reversePyramid(int n) {
        System.out.println("Reverse Pyramid Pattern:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Hour Glass Pattern
    public static void hourGlass(int n) {
        System.out.println("Hour Glass Pattern:");
        //Printing the pattern
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Printing the reverse pattern
        for (int i = n-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Main method
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines for the Stair case pattern:");
        int n = scan.nextInt();
        leftStaircase(n);
        rightStaircase(n);
        staircase(n);
        pyramid(n);
        reversePyramid(n);
        hourGlass(n);
        scan.close();
    }
}
