package com.cht.training;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main60 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> rankings = new TreeMap<>();
        rankings.put(90, "Tokyo");
        rankings.put(60, "Taipei");
        rankings.put(50, "Kaohsiung");
        rankings.put(75, "Osaka");
        rankings.put(95, "Beijing");
        System.out.println("desc order:" + rankings.descendingMap());
        System.out.println("asc order" + rankings);
        System.out.println("over60 using tail:true" + rankings.tailMap(60,true));
        System.out.println("over60 using tail:false" + rankings.tailMap(60,false));
        System.out.println("first entry:"+rankings.firstEntry());
    }
}
