package com.company.laba10.Example35_01;

public class Example35_01_01 {
    public static void main(String[] args) {
        try { //вызов метода
            System.out.println("0"); // печать строки
            throw new RuntimeException("Непроверяемая ошибка"); //создан экземпляр RuntimeException с сообщением
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1 "+ e); // исключение обработано
        }
        System.out.println("2"); // печать строки
    }
}