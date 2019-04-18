package com.cht.training;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main37 {
    private static final String FILENAME = "C:\\Users\\chtti\\IdeaProjects\\JavaLab0411\\src\\com\\cht\\training\\Employee.java";
    public static void main(String[] args) {
        Path path1 = Paths.get(FILENAME);
        System.out.println("file name: " + path1.getFileName());
        System.out.println("Root path: " + path1.getRoot());
        System.out.println("parent: " + path1.getParent());
        for (Path p : path1){
            System.out.println("sub element: " + p);
        }

    }
}

