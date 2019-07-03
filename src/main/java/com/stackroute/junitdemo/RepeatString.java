package com.stackroute.junitdemo;

public class RepeatString {
    //repeat the string from the index(from the back) mentioned
    public String Repeat(String name,int num) {
        if((name==null))
                return "Not allowed";
        String s;
        char[] c = name.toCharArray();
        s=name;

        for (int i = 0; i < num; i++) {
            s=s+name.substring(c.length - num); //taking index from the


        }
        return s;
    }
}
