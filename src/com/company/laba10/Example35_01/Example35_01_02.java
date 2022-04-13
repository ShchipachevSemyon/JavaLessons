package com.company.laba10.Example35_01;

public class Example35_01_02 {
    public static void main(String[] args) {
        try { //вызов метода
            System.out.println("0"); // печать строки
            throw new RuntimeException("Непроверяемая ошибка"); // создан экземпляр RuntimeException с сообщением
          //  System.out.println("1"); // после создания экземпляра строка не будет напечатана
        } catch (Exception e) { // исключение перехвачено предком
            System.out.println("2 "+ e ); // исключение обработано
        }
        System.out.println("3"); // печать строки
    }
}
