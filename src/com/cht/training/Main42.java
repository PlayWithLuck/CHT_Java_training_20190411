package com.cht.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main42 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get(".idea\\encodings.xml");
        BasicFileAttributes attributes = Files.readAttributes(path1, BasicFileAttributes.class);
        System.out.println("is directory?"+attributes.isDirectory());
        System.out.println("is refular file:"+attributes.isRegularFile());
        System.out.println("is symbolic link:"+attributes.isSymbolicLink());
        System.out.println("file size:" + attributes.size());
    }
}
