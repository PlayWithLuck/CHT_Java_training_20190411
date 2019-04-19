package com.cht.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

interface doubleReader{
    double readDoubleFromFile() throws IOException;
}

public class Main78 implements doubleReader  {

    public static void main(String[] args) {

    }

    @Override
    public double readDoubleFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data\\myfile"));
        double result = scanner.nextDouble();
        scanner.close();
        return result;
    }
}
