package com.cht.training;

class Thread84 extends Thread{

    public Thread84(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println("start thread:");
        for(int i=0; i<10; i++){
            System.out.println("In thread:" + getName() + "process:" + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }
}

public class Main84 {
    public static void main(String[] args) {
        Thread84 t1 = new Thread84("Thread1");
        Thread84 t2 = new Thread84("Thread2");
        t1.start();
        t2.start();

    }
}
