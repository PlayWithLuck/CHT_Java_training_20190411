package com.cht.training;

import java.util.Arrays;
import java.util.Comparator;

class TotalComparator implements Comparator<Asset2> {

    @Override
    public int compare(Asset2 o1, Asset2 o2) {
        return o1.getTotal() - o2.getTotal();
    }
}

class  Asset2 {
    private String name;
    private int twd;
    private int usd;
    private static final int RATE = 31;

    public Asset2(String name, int twd, int usd){
        this.name = name;
        this.twd = twd;
        this.usd = usd;
    }

    @Override
    public String toString() {
        return String.format("[%s]TWD==>%d, USD==>%d, ==> total==>%d",
                name, twd, usd, twd + usd * RATE);
    }

    public int getTotal(){
        return  twd + usd * RATE;
    }
}

public class Main64 {
    public static void main(String[] args) {
        Asset2 [] customers = {new Asset2("Mark", 0, 100), new Asset2("John", 100, 0),
        new Asset2("Tim", 50, 50), new Asset2("Ken", 75,25)};
        System.out.println("original:" + Arrays.toString(customers));
        Arrays.sort(customers, new TotalComparator());
        System.out.println("after sort:" + Arrays.toString(customers));
    }
}
