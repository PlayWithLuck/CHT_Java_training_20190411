package com.cht.training;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main34 {
    public static void main(String[] args) throws IOException {
        try(FileInputStream inputStream = new FileInputStream("data\\Employee.7z")){
            byte[] buffer = new byte[6];
            if (inputStream.read(buffer)!=-1){
                System.out.printf("buffer=[%s], [%s], [%s], [%s], [%s], [%s]\n",
                        Integer.toHexString(buffer[0]).toUpperCase(),
                        Integer.toHexString(buffer[1]).toUpperCase(),
                        Integer.toHexString(buffer[2]).toUpperCase(),
                        Integer.toHexString(buffer[3]).toUpperCase(),
                        Integer.toHexString(buffer[4]).toUpperCase(),
                        Integer.toHexString(buffer[5]).toUpperCase());
                        // buffer=[37], [7A], [FFFFFFBC], [FFFFFFAF], [27], [1C]
            }
        }
        System.out.println("7z magic number:");
        System.out.print((char)55); //37(16進位) 轉換成 55(10進位)
        System.out.print((char)122); //7A(16進位) 轉換成 122(10進位)
//        System.out.print((char)188);
//        System.out.print((char)175);
//        System.out.print((char)39);
//        System.out.print((char)28);

    }
}
