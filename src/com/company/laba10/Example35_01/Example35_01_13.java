package com.company.laba10.Example35_01;

public class Example35_01_13 {
    public static void main(String[] args) {
        try { //вызов метода
            int l = args.length; //создание переменной со значением длины массива
            System.out.println("размер массива = " + l); // печать строки
            int h=10/l; // создание переменной
            args[l + 1] = "10"; // заполнение массива
        } catch (ArithmeticException e) { // перехват исключения если подходит
            System.out.println("Деление на ноль");// обработка исключения
        }catch (ArrayIndexOutOfBoundsException e) { // перехват исключения
            System.out.println("Индекс не существует"); // обработка исключения если подходит
        }
    }
}
