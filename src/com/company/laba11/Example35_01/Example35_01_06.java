package com.company.laba11.Example35_01;

import java.io.*;

public class Example35_01_06 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
// можно сразу записать FileReader in=null;
        Writer out = null;
// можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("C:\\tmp\\MyFile1.txt");
// файл для чтения
            out = new FileWriter("C:\\tmp\\MyFile2.txt", true);
// файл для записи разрешено добавление
            int oneByte;
            while ((oneByte = in.read()) != -1) {
// out.write((char)oneByte); // запись с уничтожением ранее сущесвтующих данных
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}

