package com.company.laba12.Example35_02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example35_02 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter out = null;
        String punctuation = "!?.,;";

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    "C:\\tmp\\MyFile1.txt"), StandardCharsets.UTF_8));
            out = new PrintWriter("C:\\tmp\\MyFile2.txt", StandardCharsets.UTF_8);

            int lineCount = 0;
            int wordsCount;
            String s;
            String[] words;
            while ((s = br.readLine()) != null) {
                wordsCount = 0;
                lineCount++;
                words = s.split(" ");
                for (int i = 1; i < words.length; i++) {
                    if (Character.toUpperCase(words[i].charAt(0)) == (words[0].charAt(0))) {
                        if (punctuation.contains(Character.toString(words[i].charAt(words[i].length() - 1)))) {
                            words[i] = words[i].substring(0, words[i].length() - 1);
                        }
                        out.println("Строка #" + lineCount + ": Слово '" + words[i] + "'");
                        wordsCount++;
                    }
                }
                out.println("В строке #" + lineCount + " было найдено " + wordsCount + " слов\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка!" + e.getMessage());
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}