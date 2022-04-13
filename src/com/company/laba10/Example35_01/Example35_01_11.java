package com.company.laba10.Example35_01;

public class Example35_01_11 {
    public static void main(String[] args) {
        try {//вызов метода
            System.out.println("0"); //печать строки
            throw new NullPointerException("ошибка"); // создан экземпляр NullPointerException с сообщением
        } catch (NullPointerException e) { // исключение перехвачено
            System.out.println("1"); // исключение обработано
        } finally { // вызов окночательного метода
            System.out.println("2"); // печать строки
        }
        System.out.println("3"); // печать строки после выполнения метода
    }
}
