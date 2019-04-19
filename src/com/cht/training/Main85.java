package com.cht.training;

class MyThread85 extends Thread{

    @Override
    public void run() {
        System.out.println("sleeping...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("time is up, wake up");
    }
}

public class Main85 {
    public static void main(String[] args) throws InterruptedException {
        MyThread85 t1 = new MyThread85();
        System.out.println("after new, thread status:" + t1.getState());
        t1.start();
        System.out.println("after start, thread status:" + t1.getState());
        for (int i=0; i<8; i++){
            Thread.sleep(500);
            System.out.printf("[%d]after start, thread status:%s\n",
                    i, t1.getState());
        }
        t1.join();
        System.out.printf("after join, state=" + t1.getState());
    }
}
