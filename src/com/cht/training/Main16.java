package com.cht.training;

public class Main16 {
    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        Integer i4 = new Integer(3);
        Integer i3 = i1;
        System.out.println("i1==i2?" + (i1==i2));
        System.out.println("i1==i3?" + (i1==i3));
        System.out.println("i1 equal to i2?" + (i1.equals(i2)));
        System.out.println("i1 equal to i4?" + (i1.equals(i4)));
    }
}
