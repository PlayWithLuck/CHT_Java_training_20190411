package com.cht.training;

import java.util.*;

public class Main67 {
    public static void main(String[] args) {
        Integer[] array1 = {3, 1, 4, 1, 5, 9, 2, 6, 8};
        List<Integer> list1 = Arrays.asList(array1);
        System.out.printf("min=%d, max=%d\n", Collections.min(list1), Collections.max(list1));
//        list1.add(500);
        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(500);
        list2.add(-3);
        list2.add(8);
        System.out.println("After modify, result="+list2);
        ArrayList<HashMap<String, String>> dataSource = new ArrayList<>();
    }
}
