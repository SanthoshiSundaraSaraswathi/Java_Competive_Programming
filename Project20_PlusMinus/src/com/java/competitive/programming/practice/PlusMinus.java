package com.java.competitive.programming.practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int listSize = arr.size();
        double pos=0;
        double neg=0;
        double zero=0;
        for(int i=0;i<listSize;i++)
        {
            if(arr.get(i)>0)
            {
                pos=pos+1;
            }
            else if(arr.get(i)<0)
            {
                neg=neg+1;
            }
            else
            {
                zero=zero+1;
            }
        }
        DecimalFormat df= new DecimalFormat("0.000000");
        System.out.println(df.format(pos/listSize));
        System.out.println(df.format(neg/listSize));
        System.out.println(df.format(zero/listSize));
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Total number of elements for calculating the PlusMinus: ");
        int n = scan.nextInt();
        System.out.print("Enter the list of elements: ");
        List<Integer> listArray = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++) {
            listArray.add(scan.nextInt());
        }
        plusMinus(listArray);
        scan.close();
    }
}
