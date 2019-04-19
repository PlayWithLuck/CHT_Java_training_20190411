package com.cht.training;

public class Main71 {
    static private void foo() throws NumberFormatException{
        try{
            int i =Integer.parseInt("l00");
            System.out.println("result="+i);
        } catch (Exception e){
            throw e;
        }

    }

    public static void main(String[] args) {
        try{
            foo();
        } catch (NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
}
