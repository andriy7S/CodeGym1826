package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (args[0].equals("-e")) {
                outputStream.write(data + 100);
            } else if (args[0].equals("-d")) {
                outputStream.write(data - 100);
            }
        }
        inputStream.close();
        outputStream.close();
    }

}
