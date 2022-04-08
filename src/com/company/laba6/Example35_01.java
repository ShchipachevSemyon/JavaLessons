package com.company.laba6;

import java.util.Scanner;

public class Example35_01 {

    private String str;
    private char ch1;

    public void setCh1(char ch1) {
         this.ch1 = ch1;
        System.out.println("Значение символьного поля равно: " + this.ch1);
    }

    public void setSt(String str) {
        this.str = str;
        System.out.println("Значение текстового поля равно: " + this.str);
    }
    public void setCh1(char charArray[]) {
        Scanner scanner = new Scanner(System.in);
        if (charArray.length == 1) {
            System.out.println("Введите символ");
            this.ch1 = scanner.nextLine().charAt(0);
            System.out.println("Значение символьного поля равно: " + this.ch1);
        } else {
            System.out.println("Заполните массив символами");
            for (int i = 0; i < charArray.length; i++) {
                charArray[i] = scanner.nextLine().charAt(0);
                if (i == 0) {
                    this.str = Character.toString(charArray[i]);
                }
                else this.str += charArray[i];
            }
            System.out.println("Значение текстового поля равно: " + this.str);
        }
    }
}

