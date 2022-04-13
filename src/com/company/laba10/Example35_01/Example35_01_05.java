package com.company.laba10.Example35_01;

public class Example35_01_05 {
    public static void main(String[] args) {
        try {//вызов метода
            System.out.println("0"); // печать строки
            throw new RuntimeException("ошибка"); // создан экземпляр RuntimeException с сообщением
        } catch (NullPointerException e) { // исключение не перехваченно
            System.out.println("1" ); // строка выполняться не будет
        }
        System.out.println("2"); // строка выполняться не будет так как будет ошибка комлиции из-за не перехваченного исключения
    }
}
