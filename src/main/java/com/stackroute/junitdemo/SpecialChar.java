package com.stackroute.junitdemo;

public class SpecialChar {

    public String Characterchecker(String ch) {

        if (ch == null)
            return ("Not allowed");
        char n= ch.charAt(0);
        if ((n >= 65) && (n <= 90))
            return ("Capital letter");
        else if ((n >= 97) && (n <= 122))
            return ("Small letter");
        else if ((n >= 48) && (n <= 57))
            return ("Number");
        else
            return ("Special character");
    }

}
