package com.cht.training;

class Thread81 extends Thread{
    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in thread 85, current thread=" + getName());
    }
}

public class Main81 {
    public static void main(String[] args) {
        Thread81 t1 = new Thread81();
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("In main tread, thread name=[%s]\n", Thread.currentThread().getName());
    }
}
