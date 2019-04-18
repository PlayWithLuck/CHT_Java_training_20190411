package com.cht.training;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main41 {
    private static final String[] attributes = {"creationTime", "size", "isDirectory"};
    private static final String[] descriptions = {"creation time", "size", "is directory"};

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".idea\\workspace.xml");
        System.out.printf("read:%b, write:%b, executable:%b\n",
                Files.isReadable(path), Files.isWritable(path), Files.isWritable(path));
        for (int i=0; i<3; i++){
            Object object = Files.getAttribute(path, attributes[i], LinkOption.NOFOLLOW_LINKS);
            System.out.println("["+descriptions[i]+"] value="+object);
        }
    }
}
