package com.cht.training;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main72 {
    public static void main(String[] args) {
//        System.out.println("Input int");
        String string1 = "";
//        String string1 = "1688";
        System.out.println("string1:" + string1);
        try{
            Scanner scanner =new Scanner(string1);
        } catch (InputMismatchException ime){
            System.out.println("format is wrong, stack trace is:");
            ime.printStackTrace();
        } catch (NoSuchElementException | IllegalStateException exception){
            System.out.println("anyway input error");
        }
//        scanner.close();
        System.out.println("close scanner");
    }
}
