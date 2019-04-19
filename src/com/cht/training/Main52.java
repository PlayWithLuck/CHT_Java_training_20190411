package com.cht.training;

import java.util.ArrayList;
import java.util.List;

public class Main52 {
    public static Double summation(List<? extends Number> nuberList) {
        Double result = 0.0;
        for (Number number : nuberList){
            result += number.doubleValue();
        }
        return result;
    }

    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        List <Double> list2 = new ArrayList<>();
        for (int i=0; i<5; i++){
            list1.add(i*i);
            list2.add(Math.sqrt((double) i*10));
        }
        System.out.println("list1:"+list1);
        System.out.println("sum of list1"+ Main52.summation(list1));
        System.out.println("list2:"+list2);
        System.out.println("sum of list2"+ Main52.summation(list2));


    }
}
