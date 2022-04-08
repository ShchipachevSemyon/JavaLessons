package com.company.laba4;

import java.util.Scanner;

public class example35_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1 ; i <= number; i++){
            for (int j = number-i; j < number; j++){
                System.out.print("+  ");
            }
            System.out.println();
        }
        System.out.println("Прямоугльный треугольник со сторонами: "+number);
    }
}
