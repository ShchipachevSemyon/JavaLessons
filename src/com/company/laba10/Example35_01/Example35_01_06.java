package com.company.laba10.Example35_01;

public class Example35_01_06 {
    public static void main(String[] args) {
        try {//вызов метода
            System.out.println("0"); // печать строки
            throw new NullPointerException("ошибка"); // создан экземпляр RuntimeException с сообщением
        } catch (ArithmeticException e) {// исключение не перехвачено
            System.out.println("1"); // строка выполняться не будет
        } catch (Exception e) { // исключение перехвачено
            System.out.println("2"); // исключение обработано
//        } catch (RuntimeException e) { // ошибка компиляции потому что предок не должен перехватывать исключение раньше
//            System.out.println("3"); //выполняться не будет
//            System.out.println("4"); // выпонлянться не будет
        }
    }
}