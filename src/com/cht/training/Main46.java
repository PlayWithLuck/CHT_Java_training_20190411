package com.cht.training;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        System.out.println("found a directory"+dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}

public class Main46 {
    public static void main(String[] args) throws IOException {
        Path rootNode = Paths.get(".\\");
        Files.walkFileTree(rootNode, new MyFileVisitor());
    }
}
