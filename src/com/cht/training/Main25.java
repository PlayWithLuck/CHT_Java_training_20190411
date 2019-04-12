package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main25 {
    private static final String S1 = "+886-911-222-333, +886-912-345-678";

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\+(\\d{3})-(\\d{3})-(\\d{3})-(\\d{3})");
        Matcher matcher1 = p1.matcher(S1);
        String convertedString = matcher1.replaceAll("0$2-$3$4");
        System.out.printf("result=%s", convertedString);
    }
}
