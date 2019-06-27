package com.stackroute.junitdemo;

public class SortAndAdd {
    public String Sadd(int n){
        int[] freq = new int[10];
        int sum=0;
        while (n> 0)
        {
            int d = n % 10;
            freq[d]++;
            n= n / 10;
            if(d%2==0)
                sum+=d;
        }
        int result = 0;
        for (int i = 9; i >= 0 ; i--)
        {
            if (freq[i] != 0)
            {
                result = i;
                freq[i]--;
                break;
            }
        }

        for (int i = 9 ; i >=0; i--){
            while (freq[i]-- != 0) {
                result = result * 10 + i;

            }}

        if (sum>15)

            return(result+"\nSum is"+sum+"\nFalse");
        else
            return(result +"\nSum is"+sum+"\nTrue" );
    }
    }

