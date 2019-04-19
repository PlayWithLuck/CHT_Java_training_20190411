package com.cht.training;

import java.util.HashMap;
import java.util.Map;

public class Main58 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Mark", "111-1111");
        phoneBook.put("Ken", "222-2222");
        phoneBook.put("Tim", "333-3333");
        for (String key : phoneBook.keySet()){
            System.out.printf("key=%s, value=%s\n", key, phoneBook.get(key));
        }
    }
}
