package com.company.laba5;

import java.util.Scanner;

public class Example35_04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число, отделив дробную часть запятой");
        double i = scanner.nextDouble();
        Example35_04 example35_04 = new Example35_04(i);
        System.out.println("Значение символьного поля " + example35_04.getLetter() + ", год " + example35_04.getYear() + ", дробная часть " + (int) example35_04.getNumber());
    }
}
