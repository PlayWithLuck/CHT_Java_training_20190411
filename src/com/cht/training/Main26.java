package com.cht.training;

public class Main26 {
    public static void main(String[] args) {
        double pi = 3.1415926879;
        System.out.printf("%e, %f\n", pi/1000, pi/1000);
        double ln2 = 6.9314718e-01;
        System.out.printf("%.2e, %.3f\n", ln2, ln2);
        for (int i = 0; i < 20; i++){
            System.out.printf("%5d, %5d, %f\n", i, i, Math.pow(i, 0.5));
        }

        for (int i = 0; i < 20; i++){
            System.out.printf("%-5d, %-5d, %f\n", i, i, Math.pow(i, 0.5));
        }
    }
}
