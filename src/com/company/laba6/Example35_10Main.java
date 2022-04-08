package com.company.laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example35_10Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько аргументов вы хотите передать функции, введите значение от 1 до 3");
        int meaning = scanner.nextInt();
        System.out.println("Введите значения, которые будут помещаться в массив");
        switch (meaning) {
            case 1:
                int number = scanner.nextInt();
                System.out.println("Вы передали один аргумент, наименьшее и наибольшее значения: " + Arrays.toString(Example35_10.returnTwo(number)));
                break;
            case 2:
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println("Вы передали два аргумента, наименьшее и наибольшее значения: " + Arrays.toString(Example35_10.returnTwo(number1, number2)));
                break;
            case 3:
                int number11 = scanner.nextInt();
                int number22 = scanner.nextInt();
                int number33 = scanner.nextInt();
                System.out.println("Вы передали три аргумента, наименьшее и наибольшее значения: " + Arrays.toString(Example35_10.returnTwo(number11, number22, number33)));
                break;
            default:
                System.out.println("Программа не может быть выполнена");
        }
    }
}

