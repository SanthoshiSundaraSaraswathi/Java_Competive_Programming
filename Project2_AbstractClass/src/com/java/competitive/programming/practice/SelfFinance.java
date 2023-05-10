package com.java.competitive.programming.practice;

public class SelfFinance extends Student {
    boolean ncc;
    boolean sport;
    int credit;
    float marks;
    float sum = 0.0F;
    int credits = 0;

    public SelfFinance() {
    }

    public String result(String allMarks) {
        String[] a = allMarks.split("\\|");
        String[] a1 = a[0].split(",");
        String[] a2 = a[1].split(",");
        if (a2[0].equals("1")) {
            this.sport = true;
        }

        for(int i = 0; i < a1.length; ++i) {
            this.marks = this.getGradePoint(Integer.parseInt(a1[i].split(" ")[0]));
            this.credit = Integer.parseInt(a1[i].split(" ")[1]);
            this.credits += 5;
            this.sum += this.marks * (float)this.credit;
        }

        if (this.sport) {
            this.marks = this.getGradePoint(Integer.parseInt(a2[1]));
            this.credit = Integer.parseInt(a2[2]);
            this.credits += 5;
            this.sum += this.marks * (float)this.credit;
        }

        float cgpa = this.sum / (float)this.credits;
        return String.format("%.2f", cgpa);
    }

    private float getGradePoint(int n) {
        if (n >= 75 && n <= 100) {
            return Float.valueOf(String.format("%.1f", (float)(9 + (n - 75) / 25)));
        } else if (n >= 60 && n <= 74) {
            return Float.valueOf(String.format("%.1f", (float)(8 + (n - 60) / 15)));
        } else if (n >= 50 && n <= 59) {
            return Float.valueOf(String.format("%.1f", 7.0F + 0.1F * (float)(n - 50)));
        } else if (n >= 40 && n <= 49) {
            return Float.valueOf(String.format("%.1f", 6.0F + 0.1F * (float)(n - 40)));
        } else {
            return n < 40 ? 0.0F : 0.0F;
        }
    }
}
