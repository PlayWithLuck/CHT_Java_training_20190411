package com.cht.training;

import java.io.Console;

public class Main28 {
    public static void main(String[] args) {
        System.out.println(Main28.class.getName());
        Console console = System.console();
        if(console==null){
            System.err.println("can not get console");
            System.exit(-1);
        }
        console.printf("**![%s]!**\n", console.readLine());

    }
}
