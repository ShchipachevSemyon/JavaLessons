package com.company.laba10.Example35_01;

public class Example35_01_12 {
    public static void m(String str, double chislo) { // метод с параметрами
        if (str == null) { // проверка str на равенство с null
            throw new IllegalArgumentException("Строка введена неверно"); // создание экзмепляра IllegalArgumentException с сообщение
            //если усовие выполнено выдаётся ошибка с сообщением
        }
        if (chislo > 0.001) { // проверка chislo на условие
            throw new IllegalArgumentException("Неверное число"); //с оздание экзмепляра IllegalArgumentException с сообщение
            //если усовие выполнено выдаётся ошибка с сообщением
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    } // вызов метода m с параметрами
}

