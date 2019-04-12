package com.cht.training;

public class Main19 {
    public static void main(String[] args) {
        String prolog = "This article is about the programming language. For the narrative devi";
        String matching = "FIND:This";
        String matching2 = "FIND:is";
        String matching3 = "FIND:IS";
        System.out.println("find This:" + prolog.regionMatches(0, matching, 5, 4));
        System.out.println("find is:" + prolog.regionMatches(2, matching2, 5, 2));
        System.out.println("find IS:(ignore case)" + prolog.regionMatches(true, 2, matching3, 5, 2));
    }
}
