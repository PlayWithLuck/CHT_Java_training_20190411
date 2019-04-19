package com.cht.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main53 {
    public static void main(String[] args) {
        //List construct
        List<String> items = new ArrayList<>();
        items.add("ios");
        items.add("android");
        items.add("blackberry");
        System.out.println("items=" + items.toString());
        String [] itemsArray = {"ios", "android", "blackberry"};
        System.out.println("[not so pretty]item array=" + itemsArray);
        System.out.println("[pretty] item array=" + Arrays.toString(itemsArray));
        for (String item : items){
            System.out.println("[L]item=" + item);
        }

        for (String item : itemsArray){
            System.out.println("[A]item=" + item);
        }

        for (int i=0; i<items.size(); i++ ){
            System.out.println("[L2]item=" + items.get(i));
        }

        for (int i=0; i<itemsArray.length; i++ ){
            System.out.println("[A2]item=" + itemsArray[i]);
        }
        for (Iterator<String> iterator = items.iterator();iterator.hasNext();){
            String item = iterator.next();
            System.out.println("using iterator, item=" + item);
        }
    }
}
