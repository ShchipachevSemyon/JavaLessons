package com.company.laba10.Example35_01;

public class Example35_01_09 {
    public static int m() {
        try {//вызов метода
            System.out.println("0"); // печать строки
            return 55; // возвращает значение
// выход из метода
        } finally { // переход к выполнению окончательного блока кода, несмотря на выход из метода
            System.out.println("1"); // печать строки
        }
    }

    public static void main(String[] args) {
        System.out.println(m()); //вызов метода m
    }
}
