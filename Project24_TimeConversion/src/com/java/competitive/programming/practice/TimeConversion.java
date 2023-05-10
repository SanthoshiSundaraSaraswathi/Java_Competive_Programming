package com.java.competitive.programming.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        String convertedTime = null;
        Date d = null;
        try {
            d = df.parse(s);
            convertedTime = outputFormat.format(d);
        } catch(ParseException e){
            System.out.print(e);
        }
        return convertedTime;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Time in hh:mm:ssaa format: ");
        String input = scan.nextLine();
        String output = timeConversion(input);
        System.out.println("24 hour Time conversion: " + output);
        scan.close();
    }
}
