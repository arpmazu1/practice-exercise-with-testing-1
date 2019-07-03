package com.stackroute.junitdemo;

public class PrintPattern {
    //printing pattern of numbers
    public String Pattern(int n ){
     if(n==0)
         return "Not allowed";

        String s="";
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)

                s=s+i;

        }
    return s; //storing it in string and returning it
    }
}
