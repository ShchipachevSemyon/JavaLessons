package com.company.laba11.Example35_03;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Example35_03 {
    public static void main(String[] args) {
        String vowels = "АаЕеЁёИиОоУуЫыЭэЮюЯя";
        String punctuation = "!,.?:";
        BufferedReader br;
        PrintWriter out;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\tmp\\MyFile1.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("C:\\tmp\\MyFile2.txt", StandardCharsets.UTF_8);

            int lineCount = 0;
            int wordsCount;
            String s;
            String[] words;
            while ((s = br.readLine()) != null) {
                wordsCount = 0;
                lineCount++;
                words = s.split(" ");
                for (String word : words) {
                    if (!vowels.contains(Character.toString(word.charAt(0)))) {
                        if (punctuation.contains(Character.toString(word.charAt(word.length() - 1)))) {
                            out.println("Слово: '" + word.substring(0, word.length() - 1)
                                    + "' (Строка в исходном файле: #" + lineCount + ")");
                            wordsCount++;
                        } else {
                            out.println("Слово: '" + word
                                    + "' (Строка в исходном файле: #" + lineCount + ")");
                            wordsCount++;
                        }
                    }
                }
                out.printf("В %d строке выбрано %d слов \n\n", lineCount, wordsCount);
            }
            br.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }
}
