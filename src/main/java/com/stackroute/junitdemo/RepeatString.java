package com.stackroute.junitdemo;

public class RepeatString {
    public String Repeat(String name,int num) {
        if((name==null))
                return "Not allowed";
        String s;
        char[] c = name.toCharArray();
        s=name;

        for (int i = 0; i < num; i++) {
            s=s+name.substring(c.length - num);


        }
        return s;
    }
}
