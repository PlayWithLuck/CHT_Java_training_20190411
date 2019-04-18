package com.cht.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main32 {
    public static void main(String[] args) throws FileNotFoundException {
//        Set<String> words = new TreeSet<>(); //<>內容可省略，因為一定跟前面的type一樣
        Set<String> words =new HashSet<>();
        try(Scanner tokenScanner = new Scanner(new FileReader("README.md"))){

            tokenScanner.useDelimiter("\\W");
            while(tokenScanner.hasNext()){
                String word = tokenScanner.next();
                words.add(word);
            }
        }

//        tokenScanner.close();
        for (String word :words){
            System.out.print(word+ " ");
        }
        System.out.println();
    }
}
