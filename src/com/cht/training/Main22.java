package com.cht.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main22 {
    private  static final String S1 = "Hello world  java   programming";
    private  static final String S2 = "Hello_world__java___programming";
    private  static final String S3 = "Hello\\world\\\\java\\\\\\programming";
    private  static final String S4 = "Hello/world//java///programming";

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\w+");
        Matcher matcher1 = p1.matcher(S1);
        while (matcher1.find()){
            System.out.printf("(%s) ", matcher1.group());
        }

        System.out.printf("\n");

        Pattern p2 = Pattern.compile("[^\\s]+");
        Matcher matcher2 = p2.matcher(S1);
        while (matcher2.find()){
            System.out.printf("(%s) ", matcher2.group());
        }
        System.out.printf("\n");

        Pattern p3 = Pattern.compile("[^_]+");
        Matcher matcher3 = p3.matcher(S2);
        while (matcher3.find()){
            System.out.printf("(%s) ", matcher3.group());
        }
        System.out.printf("\n");

        Pattern p4 = Pattern.compile("[^\\\\]+");
        Matcher matcher4 = p4.matcher(S3);
        while (matcher4.find()){
            System.out.printf("(%s) ", matcher4.group());
        }
        System.out.printf("\n");

        Pattern p5 = Pattern.compile("[^/]+");
        Matcher matcher5 = p5.matcher(S4);
        while (matcher5.find()){
            System.out.printf("(%s) ", matcher5.group());
        }
        System.out.printf("\n");



        for(String segment:S2.split("_")){
            System.out.printf("[%s] ", segment);
        }
        System.out.printf("\n");

        for(String segment:S3.split("\\\\")){
            System.out.printf("[%s] ", segment);
        }
        System.out.printf("\n");

        for(String segment:S4.split("/")){
            System.out.printf("[%s] ", segment);
        }
        System.out.printf("\n");

    }
}
