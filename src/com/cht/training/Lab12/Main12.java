package com.cht.training.Lab12;

public class Main12 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("e1 grade=" + e1.getGradLevel());
//        e1.gradLevel = 8;
        System.out.println("e1 grade=" + e1.getGradLevel());
        Employee e2 = new Employee(7);
        System.out.println("e1 grade=" + e2.getGradLevel());
    }
}
