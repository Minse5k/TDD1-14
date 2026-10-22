package com.back;

public class Calc {
    public static int run(String expression) {
        String[] str = expression.split(" ");

        return Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
    }
}
