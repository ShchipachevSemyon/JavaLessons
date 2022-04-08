package com.company.laba4;

import java.util.Random;
import java.util.Scanner;

public class example35_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введие число строк массива ");
        int line = scanner.nextInt();
        System.out.println("Введите число столбцов массива");
        int column = scanner.nextInt();
        int[][] array = new int[line][column];
        int i;
        int j;
        for (i = 0; i < line; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив чисел состоящий из " + line + " строк и " + column + " столбцов");
        int[][] array1 = new int[column][line];
        for (i = 0; i < column; i++) {
            for (j = 0; j < line; j++) {
                array1[i][j] = array[j][i];
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Обратный массив состоящий из " + column + " строк и " + line + " столбцов");
    }
}
