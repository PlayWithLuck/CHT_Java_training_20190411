package com.cht.training;

public class Main80 {
    public static void main(String[] args) {
//        int i = Integer.MIN_VALUE;
        int i = -2;
        if(i<0) {
            i= -i;
        }
        System.out.println("i="+i);
        assert (i>=0): "i should be positive";
//        System.out.println("kkk");
    }
}
