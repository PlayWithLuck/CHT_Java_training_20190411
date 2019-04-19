package com.cht.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main73 {
    private static final  String ZIP_FILE_NAME = "data\\README.zip";
    private static final String FILE_NAME = "data\\README_TXT";

    public static void main(String[] args) throws IOException {
        byte [] buffer = new byte[1024];
        try (ZipOutputStream zipOutputStream =new ZipOutputStream(new FileOutputStream(ZIP_FILE_NAME));
            FileInputStream inputStream = new FileInputStream(FILE_NAME)
            ) {
            zipOutputStream.putNextEntry(new ZipEntry(FILE_NAME));
            int lengthRead = 0;
            while ((lengthRead = inputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, lengthRead);
            }
        }
    }
}
