package com.cht.training;

public class Main68 {
    public static void main(String[] args) {
        if (args.length == 0){
//            System.out.println("need more argument");
//            System.exit(1);
            throw new IllegalArgumentException("need more argument");

        } else {
            for (String argument : args){
                System.out.println("parameter:" + argument);
            }
        }
    }
}
