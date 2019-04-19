package com.cht.training;

public class Main74 {
    public static void main(String[] args) {
        try{
            String string1 = new String(args[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please pass a parameter");
        }
    }
}
