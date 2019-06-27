package com.stackroute.junitdemo;

public class CheckNumber {
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

