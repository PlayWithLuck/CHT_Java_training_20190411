package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main23 {
    private static final String S1 = "信義區:11081 11077 11085 tel:021234567 0912345678 021234#56789 ext 3 6 9 22";

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("\\b\\d{5}\\b");
        Matcher matcher1 = pattern1.matcher(S1);
        while(matcher1.find()){
            System.out.printf("(%s)",matcher1.group());
        }

    }
}
