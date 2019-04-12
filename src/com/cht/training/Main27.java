package com.cht.training;

public class Main27 {
    public static void main(String[] args) {
        String s1 ="Hello:";
        StringBuilder builder =new StringBuilder(s1); //在同一塊記憶體空間裡新增字串內容，效能較好
        for (int i = 0; i<10; i++){
            s1 += "$"; //String 不要用+=的方式相加，不然會一直創新的記憶體空間存放，再GC不需要的字串，對程式效能不好
        }
        System.out.println(s1);
        for (int i = 0; i<10; i++){
            builder.append("$");
        }
        System.out.println(builder.toString());
    }
}
