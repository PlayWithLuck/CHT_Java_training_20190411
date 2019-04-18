package com.cht.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main45 {
    public static void main(String[] args) throws IOException {
        Path delFile = Paths.get("data\\CLONE2");
        Files.delete(delFile);
    }
}
