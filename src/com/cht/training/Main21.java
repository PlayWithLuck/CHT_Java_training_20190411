package com.cht.training;

public class Main21 {
    private  static final String S1 = "Hello world java programming";
    private  static final String S2 = "Hello_world_java_programming";
    private  static final String S3 = "Hello\\world\\java\\programming";
    private  static final String S4 = "Hello/world/java/programming";

    public static void main(String[] args) {
        for(String segment:S1.split(" ")){
            System.out.printf("[%s] ", segment);
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
