package com.cht.training;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main65 {
    public static void main(String[] args) {
        List<String> vesions = new LinkedList<>();
        vesions.add("2.3 gingerbread");
        vesions.add("4.0 ice cream sandwich");
        vesions.add("4.1 jelly bean");
        vesions.add("5.1 kitkat");
        vesions.add("5.2 lollipop");
        vesions.add("6.X marshmallow");
        vesions.add("7 nougat");
        System.out.println("original:" + vesions);
        Collections.shuffle(vesions);
        System.out.println("after shuffle:" + vesions);
        Collections.sort(vesions);
        System.out.println("after sort:" + vesions);
        Collections.reverse(vesions);
        System.out.println("after reverse:" + vesions);
    }
}
