package com.cht.training;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path>{
    private PathMatcher matcher;

    public MyFileVisitor(String pattern){
        matcher = FileSystems.getDefault().getPathMatcher(pattern);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
//        System.out.println("found a directory"+dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        findFile(file);
        return FileVisitResult.CONTINUE;
    }

    private void findFile(Path path){
        if (matcher.matches(path)){
            System.out.println("find one!"+path.getFileName());
        }
    }
}

public class Main46 {
    public static void main(String[] args) throws IOException {
        Path rootNode = Paths.get(".\\");
        Files.walkFileTree(rootNode, new MyFileVisitor("glob:**.class"));
    }
}
