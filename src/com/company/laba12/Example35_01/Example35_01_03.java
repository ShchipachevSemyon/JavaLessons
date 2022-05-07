package com.company.laba12.Example35_01;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Example35_01_03 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
// С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\tmp\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, StandardCharsets.UTF_8);
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
// С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream(); // байтовый
            Reader rUrl = new InputStreamReader(inUrl, StandardCharsets.UTF_8);
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
// С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            Reader rArray = new InputStreamReader(inArray, StandardCharsets.UTF_8); // символьный
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}