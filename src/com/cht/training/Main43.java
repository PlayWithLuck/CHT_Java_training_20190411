package com.cht.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main43 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("data\\README_TXT");
        Path dest = Paths.get("data\\CLONE");
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("copy success!");
    }
}
