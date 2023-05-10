package com.java.competitive.programming.practice;

import java.io.PrintStream;

public class Aided extends Student{
    boolean ncc;
    boolean sport;
    int credit;
    float marks;
    float sum = 0.0F;
    int credits = 0;

    public Aided() {
    }

    public String result(String allMarks) {
        String[] a = allMarks.split("\\|");
        String[] a1 = a[0].split(",");
        String[] a2 = a[1].split(",");
        String[] a3 = a[2].split(",");
        if (a2[0].equals("1")) {
            this.ncc = true;
        }

        if (a3[0].equals("1")) {
            this.sport = true;
        }

        for(int i = 0; i < a1.length; ++i) {
            this.marks = this.getGradePoint(Integer.parseInt(a1[i].split(" ")[0]));
            PrintStream var10000 = System.out;
            String[] var10001 = a1[i].split(" ");
            var10000.println("Marks:" + var10001[0]);
            System.out.println("Grade Point:" + this.marks);
            this.credit = Integer.parseInt(a1[i].split(" ")[1]);
            System.out.println("Credit:" + this.credit);
            this.credits += 5;
            System.out.println("Summation of Credits(denominator):" + this.credits);
            this.sum += this.marks * (float)this.credit;
            System.out.println("Summation of gradepoint*credit(numerator):" + this.sum);
        }

        if (this.ncc) {
            this.marks = this.getGradePoint(Integer.parseInt(a2[1]));
            System.out.println("Marks:" + a2[1]);
            System.out.println("Grade Point:" + this.marks);
            this.credit = Integer.parseInt(a2[2]);
            System.out.println("Credit:" + this.credit);
            this.credits += 5;
            System.out.println("Summation of Credits(denominator):" + this.credits);
            this.sum += this.marks * (float)this.credit;
            System.out.println("Summation of gradepoint*credit(numerator):" + this.sum);
        }

        if (this.sport) {
            this.marks = this.getGradePoint(Integer.parseInt(a3[1]));
            System.out.println("Marks:" + a3[1]);
            System.out.println("Grade Point:" + this.marks);
            this.credit = Integer.parseInt(a3[2]);
            System.out.println("Credit:" + this.credit);
            this.credits += 5;
            System.out.println("Summation of Credits(denominator):" + this.credits);
            this.sum += this.marks * (float)this.credit;
            System.out.println("Summation of gradepoint*credit(numerator):" + this.sum);
        }

        float cgpa = this.sum / (float)this.credits;
        return String.format("%.2f", cgpa);
    }

    private float getGradePoint(int n) {
        if (n >= 75 && n <= 100) {
            return Float.valueOf(String.format("%.1f", (float)(9 + (n - 75) / 25)));
        } else if (n >= 60 && n <= 74) {
            return Float.valueOf(String.format("%.1f", 8.0F + 0.1F * (float)((n - 60) / 15)));
        } else if (n >= 50 && n <= 59) {
            return Float.valueOf(String.format("%.1f", 7.0F + 0.1F * (float)(n - 50)));
        } else if (n >= 40 && n <= 49) {
            return Float.valueOf(String.format("%.1f", 6.0F + 0.1F * (float)(n - 40)));
        } else {
            return n < 40 ? 0.0F : 0.0F;
        }
    }
}
