package com.company.laba11.Example35_01;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example35_01_02 {

    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("C:/tmp/text.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();
            InputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка" + e);
        }
    }
}
