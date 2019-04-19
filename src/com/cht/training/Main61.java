package com.cht.training;

import java.util.LinkedList;
import java.util.Queue;

public class Main61 {
    public static void main(String[] args) {
        Queue<String> waitingList = new LinkedList<>();
        waitingList.add("Apple");
        waitingList.add("Banana");
        waitingList.add("Citron");
        waitingList.add("Donuts");
        System.out.println("original sequence:" + waitingList);
        while (!waitingList.isEmpty()){
            System.out.printf("now serve:%s, and will be removed\n", waitingList.remove());
        }
    }
}
