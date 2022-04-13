package com.company.laba10.Example35_01;

public class Example35_01_14 {
    public static void m(int x) throws ArithmeticException { // создание метода, с обработкой исключения
        int h = 10 / x; // создание переменной
    }

    public static void main(String[] args) {
        try { // вызов метода
            int l = args.length; //создание переменной со значением длины массива
            System.out.println("размер массива = " + l); // печать строки
            m(l); // вызов метода m
        } catch (ArithmeticException e) { // перехват исключения
            System.out.println("Ошибка: Деление на ноль"); // обработка исключения
        }
    }
}
