package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        public static boolean isPositiveNumber(String str) {
            for (String arg : args) {
                if (!StringUtils.isPositiveNumber(arg)) {
                    return false;
                }
            }
            return true;
        }
    }
}