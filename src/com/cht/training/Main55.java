package com.cht.training;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main55 {
    public static void main(String[] args) {
        String sting1 ="abcde12345";
        StringBuilder builder = new StringBuilder();
        List<Character> list1 = new LinkedList<>();
        for (char stringChar: sting1.toCharArray()){
            list1.add(stringChar);
        }
        ListIterator<Character> reverseInterator = list1.listIterator(list1.size());
        while (reverseInterator.hasPrevious()){
            char c =reverseInterator.previous();
            builder.append(c);
        }
        System.out.println("reverse string=" + builder.toString());
    }
}
