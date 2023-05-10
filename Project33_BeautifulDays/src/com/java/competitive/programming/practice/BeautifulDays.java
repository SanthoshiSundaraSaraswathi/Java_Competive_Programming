package com.java.competitive.programming.practice;

public class BeautifulDays {
    public static int reverse (int i) {
        int revNum = 0;
        while(i != 0) {

            // get last digit from num
            int digit = i % 10;
            revNum = revNum * 10 + digit;

            // remove the last digit from num
            i /= 10;
        }
        return revNum;
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        int diff = 0;
        for (int m = i; m <= j; m++) {
            int r = reverse(m);
            //System.out.println(m);
            //System.out.println(r);
            if (r > m) {
                diff = r - m;
            } else if (r < m) {
                diff = m - r;
            } else {
                diff = r - m;
            }
            //System.out.println(diff);
            //System.out.println(diff % k);
            if ((diff % k == 0) || (diff == 0)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        int i = 20;
        int j = 23;
        int k = 6;
        int c = beautifulDays(i, j, k);
        System.out.println(c);
    }
}
