package com.cht.training;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main69 {
    public static void main(String[] args) {
        System.out.println("Input int");
        Scanner scanner =new Scanner(System.in);
//        scanner.close();
        try{
            System.out.println("your input is:" + scanner.nextInt());
        } catch (InputMismatchException ime){
            System.out.println("format is wrong, stack trace is:");
            ime.printStackTrace();
        } catch (NoSuchElementException nsee){
            System.out.println("input is not enogh");
        } catch (IllegalStateException ise) {
            System.out.println("illegal state");
        }
        scanner.close();
        System.out.println("close scanner");
    }
}
