package com.cht.training;

public class Main15 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println("o1, o2" + (o1==o2));
        System.out.printf("is o1, o3 equal?%b", o1 == o3);
        System.out.println("3==5?" + (3==5));
        System.out.println("5==5?" + (5==5));

        System.out.printf("\n%d\n", o1.hashCode());
        System.out.printf("\n%d\n", o2.hashCode());
        System.out.printf("\n%d\n", o3.hashCode());
    }
}
