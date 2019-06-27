package com.stackroute.junitdemo;

public class CheckPalindrome {
    public String palindrome(int n) {
        int orig = n;
        int sum = 0;
        int rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = 10 * rev + t;
            if (t % 2 == 0)
                sum += t;
            n = n / 10;
        }
        if (orig == rev) {

            if (sum > 25)
            {   return "Palindrome. Sum is greater then 25";}
            else
            {   return "Palindrome. Sum is smaller then 25";}

        }
        else
            return "Not Palindrome";
    }
}