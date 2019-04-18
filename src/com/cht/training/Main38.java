package com.cht.training;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main38 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("out");
        System.out.println("file name: " + path.getFileName());
        System.out.println("URI: " + path.toUri());
        System.out.println("absolute path: " + path.toAbsolutePath());
        System.out.println("normalized: " + path.normalize());
        Path derivedPath = Paths.get(path.normalize().toString());
        System.out.println("absolute path: " + derivedPath.toAbsolutePath());
        System.out.println("real path: " + derivedPath.toRealPath(LinkOption.NOFOLLOW_LINKS));
        Path path2 = Paths.get(".");
        Path newPath = path2.resolve("out");
        System.out.println("after resolve, path= " + newPath.toAbsolutePath());
    }
}
