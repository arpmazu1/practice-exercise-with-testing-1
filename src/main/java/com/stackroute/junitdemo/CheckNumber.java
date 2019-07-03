package com.stackroute.junitdemo;

public class CheckNumber {
    //check number is between 20 and 30 should return the appropriate messages accordingly
    public String CheckNum (int n){

        if((n>20)&&(n<30)){
            if(n%2==0)

                return("Jerry");
            else
                return("Tom");

        }
        else
            return("Not found");
    }
    }

