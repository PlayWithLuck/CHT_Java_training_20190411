package com.cht.training;

class Runnable83 implements Runnable{

    private static final int[] items ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public void run() {
        for(int item:items){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Run #" + item);
        }

    }
}

public class Main83 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable83());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work finished, I can go home...");
    }


}
