package com.cht.training;

import java.util.Deque;
import java.util.LinkedList;

public class Main62 {
    public static void main(String[] args) {
        Deque<String> surveys = new LinkedList<>();
        surveys.add("Mark-100");
        surveys.add("John-70");
        surveys.add("Ken-50");
        surveys.add("Tim-0");
        if (surveys.pollFirst()!= null && surveys.pollLast() !=null){
            System.out.println("after cut head & tail, result=\n"+surveys);
        }
    }
}
