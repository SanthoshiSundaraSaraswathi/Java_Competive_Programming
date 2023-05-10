package com.java.competitive.programming.practice;

import java.util.Scanner;

public class WorldArmy_vs_Alien {

    public static void main(String[] args) {
        
	// write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Time when the mission was launched: ");
        String launchTime= scan.nextLine();
        System.out.println("Please specify the time it takes the mission to travel: ");
        String travelTime = scan.nextLine();
        String launch[] = launchTime.split(" ");
        String travel[] = travelTime.split(" ");
        int launchHour = Integer.parseInt(launch[0]);
        int launchMin = Integer.parseInt(launch[1]);
        int travelHour = Integer.parseInt(travel[0]);
        int travelMin = Integer.parseInt(travel[1]);
        int minSum = 0;
        int hourSum = 0;
        minSum = launchMin + travelMin;
        if(minSum > 59) {
            hourSum += 1;
            minSum %= 60;
        }
        hourSum = hourSum + launchHour + travelHour;
        if(hourSum > 23){
            hourSum %= 24;
        }
        String hour = String.format("%02d", hourSum);
        String min = String.format("%02d", minSum);
        System.out.println("The time when the World Army meets Alien ships: " + hour + " " + min);
        scan.close();
    }
}
