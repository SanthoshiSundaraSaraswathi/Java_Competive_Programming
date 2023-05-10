package com.java.competitive.programming.practice;

import java.util.Scanner;

public class EmbeddedString {
    public static String find_Embedded_String(String words[], String input) {
        String output = null;
        int wordsSize = words.length;
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        //System.out.println(input);
        String inter = null;
        for(int i = 0; i < wordsSize; i++) {
            String processing = words[i];
            //System.out.println(processing);
            inter = input;

            //System.out.println(inter);
            int processingWordSize = processing.length();
            for(int j = 0; j < processingWordSize ; j++) {

                char c = processing.charAt(j);
                if(inter.contains(Character.toString(c))) {
                    sb.deleteCharAt(inter.indexOf(c));
                    inter = sb.toString();
                } else {
                    sb.setLength(0);
                    //System.out.println(sb);
                    sb.append(input);
                    //System.out.println(sb);
                    break;
                }
                //System.out.println(inter);
            }
            int diff = input.length() - inter.length();
            if(diff == processingWordSize){
                output = processing;
                break;
            }
        }
        if(output == null){
            output = "none";
        }
        return output;
    }
    public static void main(String[] args) {
        // write your code here
       /* String[] words = {"cat", "dog", "baby", "fly"};
        String string1 = "tacbdheri";
        String string2 = "tbadgcji";
        String string3 = "baydefki";
        String string4 = "qwerty";
        String string5 = "bhuianbdfy";
        String string6 = "yhuilghtf";
        String string7 = "qsdvbnmrop";
        String string8 = "dfhojkldg";
        String op = find_Embedded_String(words, string8);
        System.out.println(op);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of the words which we want to find in: ");
        int count = scan.nextInt();
        String words[] = new String[count];
        System.out.println("Enter the Words list to find on: ");
        for(int i = 0; i < count; i++) {
            words[i] = scan.next();
        }
        System.out.println("Enter the Embedded String : ");
        String input = scan.next();
        String op = find_Embedded_String(words, input);
        System.out.println("The word that is embedded in the input(" + input + ") is : " + op);
        scan.close();
    }
}
