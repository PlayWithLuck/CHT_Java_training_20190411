package com.cht.training;

import java.io.*;

public class Main35 {
    private static final String FILENAME = "data\\main35.data";

    public static void main(String[] args) throws IOException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILENAME))){
            for (int i=0; i<30; i++){
                outputStream.writeByte(i);
                outputStream.writeInt(i);
                outputStream.writeLong(i);
                outputStream.writeDouble(i);

            }
        }
        try(DataInputStream inputStream = new DataInputStream(new FileInputStream(FILENAME))){
            for (int i = 0; i<30; i++){
                System.out.printf("(%d), (%d), (%d), (%.2g)\n",
                        inputStream.readByte(),
                        inputStream.readInt(),
                        inputStream.readLong(),
                        inputStream.readDouble());
            }
        }
    }
}
