package com.cht.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main77 {
    private static int readIntegerFromMyfile() throws FileNotFoundException{
        int i = new Scanner(new File("myFile")).nextInt();
        return i;
    }

    public static void main(String[] args) throws FileNotFoundException {
        readIntegerFromMyfile();

    }
}
