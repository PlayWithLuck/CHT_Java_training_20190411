package com.cht.training;

import java.io.*;

public class Main31 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data\\output"));
        for (int i=0; i<20; i++){
            String line = String.format("%d, %.4f, %.4f\n", (i+1), Math.pow(i+1, 2), Math.sqrt((double) i+1));
            writer.write(line);
        }
        writer.close();
    }
}
