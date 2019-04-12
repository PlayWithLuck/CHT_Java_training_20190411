package com.cht.training;

public class Main18 {
    private static String key = "day";
    private static String weekDays = "Sunday Monday Tuesday Wednesday Thuesday Friday Saturday";

    public static void main(String[] args) {
        System.out.println("find 'day':"+weekDays.indexOf(key));
        System.out.println("last index if:"+weekDays.lastIndexOf(key));
        System.out.println("total length:"+weekDays.length());
        int index = 0;
        while (weekDays.indexOf(key,index) > -1){
            index = weekDays.indexOf(key,index);
            System.out.println("get a index"+index);
            index += key.length();
        }
    }
}
