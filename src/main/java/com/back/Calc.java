package com.back;

public class Calc {
    public static int run(String expression) {
        String[] parts = expression.split(" ");

        return calc(parts, parts.length-1);
    }

    private static int calc(String[] parts, int idx) {
        if(idx==0) {
            return Integer.parseInt(parts[0]);
        }

        switch (parts[idx-1]) {
            case "+" -> {
                return calc(parts, idx-2) + Integer.parseInt(parts[idx]);
            }
            case "-" -> {
                return calc(parts, idx-2) - Integer.parseInt(parts[idx]);
            }
        }

        return 0;
    }
}
