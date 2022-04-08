package com.company.laba4;

import java.util.Scanner;

public class example35_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String code = scanner.next();
        char[] afterStr = new char[code.length()];
        System.out.println("Введите ключ");
        int key = scanner.nextInt();

        for (int i = 0; i < code.length(); i++) {
            afterStr[i] = (char) (code.charAt(i) + key);
        }
        System.out.println("Новая строка " + new String(afterStr));
        System.out.println("Выполнить обратное преобразование?(y/n)");
        String answer = scanner.next();
        if (answer.charAt(0) == 'y') {
           System.out.println(code);
        } else if (answer.charAt(0) == 'n') {
            System.out.println("До свидания!");
        } else if (answer.charAt(0) != 'y' && answer.charAt(0) != 'n') {
            System.out.println("Введите корректное значение");
        }
    }
}
