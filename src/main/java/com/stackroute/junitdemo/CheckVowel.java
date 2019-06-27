package com.stackroute.junitdemo;

public class CheckVowel {
    public String Checker(String str) {
        int i;
        int len;
        if (str==null)
        { return "Not allowed";}
        String s="";
        len = str.length();

        for (i = 0; i < len; i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U' || str.charAt(i) == 'u')
                s=s+" Vowel";
            else {
                s=s+" Consonent";
            }
        }
        return s;
    }
}
