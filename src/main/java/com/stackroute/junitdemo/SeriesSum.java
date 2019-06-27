package com.stackroute.junitdemo;

public class SeriesSum {
    public String AddSeries(String[] num) {


        int i = 0, total = 0;
        try {
            while (Integer.parseInt(num[i]) != 0) {
                total += Integer.parseInt(num[i]);
                i++;
            }
            return ("Sum of the numbers:" + total);
        }
        catch (Exception e) {
            return ("Error: not a valid input");


        }
    }}
