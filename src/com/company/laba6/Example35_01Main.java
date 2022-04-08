package com.company.laba6;

import java.util.Scanner;
public class Example35_01Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Example35_01 newOver = new Example35_01();
        System.out.println("Введите 's' если хотите придать данным текстовый тип, введите 'c' если хотите придать символьный тип, введите 'a' если хотите придать массив символов");
        char type = scanner.nextLine().charAt(0);
        switch (type) {
            case 's':
                System.out.println("Введите строку");
                String line = scanner.nextLine();
                newOver.setSt(line);
                break;
            case 'c':
                System.out.println("Введите символ");
                char symbol = scanner.nextLine().charAt(0);
                newOver.setCh1(symbol);
                break;
            case 'a':
                System.out.println("Введите размер массива");
                int size = scanner.nextInt();
                char charArr[] = new char[size];
                newOver.setCh1(charArr);
                break;
        }
    }
}


