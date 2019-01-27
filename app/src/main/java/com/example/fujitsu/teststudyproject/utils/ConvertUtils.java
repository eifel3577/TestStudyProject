package com.example.fujitsu.teststudyproject.utils;

public class ConvertUtils {

    public static int stringToInteger(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        }
        catch (NumberFormatException e){}
        return result;

    }

}