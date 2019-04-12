package com.cht.training;

public class Main10 {
    public Main10(int i){
        System.out.println("constructor with 1 int called");
    }

    public Main10(){
        System.out.println("re-write default constructor");
    }

    public static void main(String[] args) {
        Main10 m1 =new Main10();
        System.out.println("m10"+m1.toString());
        Main10 m2 =new Main10(100);
    }
}
