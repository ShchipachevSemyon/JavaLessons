package com.company.laba10.Example35_02;

import java.util.*;

public class Example35_02_03 {

        public static void main(String[] args) {
            try {
                int sum = 0;
                System.out.println("Введите количество суммируемых чисел");
                Scanner scanner = new Scanner(System.in);
                byte number = scanner.nextByte();
                byte array[] = new byte[number];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите число");
                    number = scanner.nextByte();
                    array[i] = number;
                    sum +=number;
                }
                System.out.println(sum);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e +" введена строка вместо числа или число выходящее за диапазон" );
            } catch (NegativeArraySizeException e) {
                System.out.println("Ошибка: " + e + " введён отрицательный размер массива");
            }
        }
    }
