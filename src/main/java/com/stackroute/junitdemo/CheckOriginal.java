package com.stackroute.junitdemo;

import java.util.Scanner;

public class CheckOriginal {
    //checking if the number entered is more,lessor equal to original number
    public String Checker(int num){
        int original=60;
        if (num < original)
            return("Number guessed is less than original number");

        else if (num > original)
            return("Number guessed is more than original number");

        else
            return("Number guessed matches the original number");

    }
}
