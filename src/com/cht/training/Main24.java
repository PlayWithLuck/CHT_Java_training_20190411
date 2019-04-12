package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main24 {
    private static final String S1 = "Mark:A123456789:0912-345-678, John:Z987654321:0987-654-321, Ken:C333444555";

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[A-Z]\\d{9}");
        Matcher matcher1 = p1.matcher(S1);
        while(matcher1.find()){
            System.out.printf("(%s) ", matcher1.group());
        }
        System.out.printf("\n");

        Pattern p2 = Pattern.compile("\\d{4}-\\d{3}-\\d{4}");
        Matcher matcher2 = p2.matcher(S1);
        while(matcher2.find()){
            System.out.printf("(%s) ", matcher2.group());
        }
        System.out.printf("\n");
    }
}
