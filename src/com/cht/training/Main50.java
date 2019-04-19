package com.cht.training;

import java.util.ArrayList;
import java.util.List;

final class AutoFill{
    public static <Y, list> void fill(List<Y> list, Y value){
        for (int i=0; i<list.size(); i++){
            list.set(i, value);
        }

    }
}

public class Main50 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(100);
        list1.add(300);
        System.out.println("original list:" + list1);
        AutoFill.fill(list1,7);
        System.out.printf("after change:" + list1);
    }
}
