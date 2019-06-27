package com.stackroute.junitdemo;

public class ReverseString {

    public String RevString(String str){
        if(str==null)
            return "Not allowed";
        String s="";
        char[] c=str.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            s=s+c[i];
        }
        return s;

    }
}
