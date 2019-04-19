package com.cht.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main54 {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        System.out.println("size=" + items.size());
        for (int i = 0; i < 10; i++) {
            items.add(i * i);
            System.out.println("size=" + items.size());
        }
        for (Integer item : items) {
            System.out.printf("item=%d ,", item);
        }

        System.out.println();
        Iterator<Integer> removeIterator = items.iterator();
        while (removeIterator.hasNext()) {
            removeIterator.next();
            removeIterator.remove();
        }
        System.out.println("finally size=" + items.size());
    }
}
