package com.back;

public class Calc {
    public static int run(String expression) {
        String[] str = expression.split(" ");
        int result;

        result = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);

        return result;
    }
}
