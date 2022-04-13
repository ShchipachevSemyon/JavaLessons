package com.company.laba10.Example35_01;

public class Example35_01_07 {
    public static void main(String[] args) {
        try {//вызов метода
            System.out.println("0"); // печать строки
            throw new NullPointerException("ошибка"); // создан экземпляр NullPointerException с сообщением
        } catch (NullPointerException e) { // исключение перехвачено
            System.out.println("1" ); // исключение обработано
            throw new ArithmeticException(); // создан экземпляр ArithmeticException
        }catch (ArithmeticException e) { // ошибка компиляции потому что нельзя перехватить исключение с помощью чужого экзмепляра
            System.out.println("2" ); // выполняться не будет
        }
        System.out.println("3"); // выполняться не будет
    }
}
