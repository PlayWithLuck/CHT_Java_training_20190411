package com.cht.training;

class Runnable82 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in runnable82, thread is:" + Thread.currentThread().getName());
    }
}

public class Main82 {

    public static void main(String[] args) {
        Thread thread2 = new Thread(new Runnable82());
        thread2.start();
        System.out.println("In main thread, thread name is:" + Thread.currentThread().getName());
    }
}
