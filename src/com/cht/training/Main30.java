package com.cht.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main30 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("data\\README_TXT");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String result;
        while ((result = bufferedReader.readLine())!=null){
            System.out.printf("get a line[%d]:%s\n", result.length(), result);
        }
        reader.close();

    }
}
