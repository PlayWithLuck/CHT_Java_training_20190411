package com.cht.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main40 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:\\Users\\chtti\\IdeaProjects\\JavaLab0411\\out");
        Path path2 = Paths.get(".\\out");
        System.out.println("compare using file:" + Files.isSameFile(path1, path2));
        System.out.println("is directory?"+isDirectory(path1));
        Path path3 = Paths.get("C:\\Users\\chtti\\IdeaProjects\\JavaLab0411\\src\\com\\cht\\training\\Main10.java");
        System.out.println("path3 is directory?"+isDirectory(path3));
    }

    private static boolean isDirectory(Path path) throws FileNotFoundException {
        if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
            if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)){
                return true;
            } else{
                return false;
            }
        } else{
            throw new FileNotFoundException();
        }
    }


}

