package com.cht.training;

import java.util.ArrayList;
import java.util.List;

public class Main51 {
    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(45.67);
        List<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("45.67");
        display(list1);
        display(list2);
    }

    private static void display(List<?> list){
        for (Object item : list){
            System.out.printf("<<%s>>", item.toString());
        }
    }
}
