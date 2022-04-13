package com.company.laba10.Example35_01;

public class Example35_01_10 {
    public static int m() {
        try {//вызов метода
            System.out.println("0"); //печать строки
            return 25; // возвращет значение и выходит из метода
        } finally { // переход к выполнению окончательного блока кода, несмотря на выход из метода
            System.out.println("1"); // печать строки
            return 20; // возвращет значение, заменяя прошлое значение
        }
    }

    public static void main(String[] args) {
        System.out.println(m()); // вызов метода m
    }
}
