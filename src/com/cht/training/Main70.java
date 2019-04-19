package com.cht.training;

public class Main70 {
    public static void myFunction() {
        String[] names ={"John", "Ken", "Mark"};
        String name = "";
        try {
            name = names[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch array exception, re-throw");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            myFunction();
        } catch ( Exception e){
            System.out.println("rethrow class=" + e.getClass());
            System.out.println("rethrow causes=" + e.getCause());
        }
    }
}
