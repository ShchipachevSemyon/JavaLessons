package com.company.laba4;

import java.util.Scanner;

public class example35_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int line = scanner.nextInt();
        System.out.println("Введите количество столбцов массива");
        int column = scanner.nextInt();
        int[][] array = new int[line][column];
        int a = 0;
        for (int i = 0; i < line; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = a++;
                }
            } else {
                for (int j = column - 1; j >= 0; j--) {
                    array[i][j] = a++;
                }
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
