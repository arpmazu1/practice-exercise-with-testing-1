package com.stackroute.junitdemo;

public class CheckPalindrome {
    //check if the number is pallindrome or not if palindrome should check the sum is greater than 25
    public String palindrome(int n) {
        if(n<0)
            return "negative value";
        int orig = n; //storing the original values
        int sum = 0;
        int rev = 0;
        while (n > 0) {
            int t = n % 10;
            rev = 10 * rev + t;
            if (t % 2 == 0)
                sum += t;
            n = n / 10;
        }
        if (orig == rev) { //checking whether number is palindrome or not

            if (sum > 25)
            {   return "Palindrome. Sum is greater then 25";}
            else
            {   return "Palindrome. Sum is smaller then 25";}

        }
        else
            return "Not Palindrome";
    }
}