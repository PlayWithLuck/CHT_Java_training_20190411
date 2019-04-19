package com.cht.training;

public class Main76 {
    static int fab(int seed){
        int result = 0;
        if (seed == 0){
            result = 1;
            return 1;
        }
        result = fab(seed - 1) * seed;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("seed10, result:" + fab(10));
    }
}
