package com.cht.training;

import java.util.HashSet;
import java.util.Set;

public class Main56 {
    public static void main(String[] args) {
        String logs ="ken ken mark john ken ken mark mark john";
        Set<String> candidates = new HashSet<>(); //HashSet 可過濾掉Set重複的東西
        for (String id : logs.split("\\W+")){
            candidates.add(id);
        }
        System.out.println("candidates are" + candidates);
    }
}
