package com.cht.training;

import java.util.Set;
import java.util.TreeSet;

public class Main57 {
    private static final String PROLOG = "Prolog is a logic programming language associated with artificial intelligence and computational linguistics."
            +"\n"+"Prolog has its roots in first-order logic, a formal logic, and unlike many other programming languages, Prolog is intended primarily as a declarative programming language: the program logic is expressed in terms of relations, represented as facts and rules. A computation is initiated by running a query over these relations.";

    public static void main(String[] args) {
        Set<Character> orderChar = new TreeSet<>();
        for (char content : PROLOG.toCharArray()){
            orderChar.add(content);
        }
        System.out.println("Used character" + orderChar);
    }
}
