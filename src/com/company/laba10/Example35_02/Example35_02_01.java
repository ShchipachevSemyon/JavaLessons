package com.company.laba10.Example35_02;

import java.util.*;
public class Example35_02_01 {
    public static void main(String[] args) {
        try {
            int sum = 0;
            System.out.println("Введите количество суммируемых чисел");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int array[] = new int[number];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите число");
                number = scanner.nextInt();
                if (number<0){
                    System.out.println("Ошибка: введененно отрицательное число");
                    return;
                }
                array[i] = number;
                sum +=number;
            }
            System.out.println("Среднее арифмитическое: " + sum / array.length);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: " + e +" введена строка вместо числа" );
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: " + e + " введён отрицательный размер массива");
        }
    }
}