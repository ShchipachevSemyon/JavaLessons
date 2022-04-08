package com.company.laba4;

import java.util.Scanner;

public class example35_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования. (на английском)");
        String code = scanner.nextLine();
        char[] afterStr = new char[code.length()];
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        if (key >= 94) {
            key = key % 94;
        }
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) > 126 || code.charAt(i) < 32) {
                System.out.println("Введите корректное значение");
                break;
            } else {
                for (i = 0; i < code.length(); i++) {
                    if (code.charAt(i) + key <= 126) {
                        afterStr[i] = (char) (code.charAt(i) + key);
                    } else {
                        char f = (char) (code.charAt(i) - 95);
                        for (int j = 0; j < code.length(); j++) {
                            afterStr[i] = (char) (f + key);
                        }
                    }
                }
            }
            System.out.println("Новая строка: " + new String(afterStr));
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
}
