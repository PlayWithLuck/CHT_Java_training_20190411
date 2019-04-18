package com.cht.training;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main39 {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\chtti\\IdeaProjects\\JavaLab0411\\out");
        Path path2 = Paths.get(".\\out");
        System.out.println("path2"+path2.toAbsolutePath());
        System.out.println("absolute:" + path2.toAbsolutePath().equals(path1.toAbsolutePath()));
        System.out.println("compare:" + path2.compareTo(path1));
        System.out.println("equal:"+path2.equals(path1));
        Path path3 = path2.normalize().toAbsolutePath();
        Path path4 = path1.normalize().toAbsolutePath();
        System.out.println("path3="+path3.toString());
        System.out.println("path4="+path4.toString());
        System.out.println("compare:" + path4.compareTo(path3));
        System.out.println("equal:"+path4.equals(path3));

    }
}
