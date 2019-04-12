package com.cht.training.Lab8;

public class Employee implements Working { //Employee實作Working的介面，需要實作Working內的方法

    @Override
    public void startWork() {

    }

    @Override
    public void endWork() {

    }

    public int a;
    protected int b;
    int c;
    private int d;
    public void doSomething(){
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }


}
