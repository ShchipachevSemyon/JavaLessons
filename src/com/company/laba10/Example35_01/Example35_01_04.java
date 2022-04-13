package com.company.laba10.Example35_01;

public class Example35_01_04 {
    public static void main(String[] args) {
        try {//вызов метода
            System.out.println("0"); // печать строки
            throw new RuntimeException("ошибка"); // создан экземпляр RuntimeException с сообщением
        } catch (NullPointerException e) { //исключение не перехвачено
            System.out.println("1" ); // строка выполняться не будет
        }catch (Exception e) { // исключение перехвачено предком
            System.out.println("2" ); // исключение обработано
        }catch (Error e) { // исключение не будет перехваченно
            System.out.println("3" ); // строка выполняться будет
        }
        System.out.println("4"); // печать строки
    }
}
