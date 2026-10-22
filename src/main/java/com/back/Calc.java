package com.back;

public class Calc {
    public static int run(String expression) {
        String[] str = expression.split(" ");

        return calc(str, str.length-1);
    }

    private static int calc(String[] s, int n) {
        if(n==0) {
            return Integer.parseInt(s[0]);
        }

        switch (s[n-1]) {
            case "+" -> {
                return calc(s, n-2) + Integer.parseInt(s[n]);
            }
            case "-" -> {
                return calc(s, n-2) - Integer.parseInt(s[n]);
            }
        }

        return 0;
    }
}
